package com.example;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

public class ExampleDaoGenerator {
    public static void main(String[] args) throws Exception {
//        Schema schema = new Schema(1, "com.example.greendao");

        Schema schema = new Schema(1, "com.tongjin.bean");
        schema.setDefaultJavaPackageDao("com.tongjin.dao");
        addNote(schema);
        new DaoGenerator().generateAll(schema, "D:/Game/GreenDaoTest/app/src/main/java-gen");
    }

    private static void addNote(Schema schema) {
        //一个实体（类）就关联到数据库中的一张表，此处表民为【Note]
        Entity note = schema.addEntity("Note");

        note.addIdProperty().primaryKey();
        note.addStringProperty("text").notNull();
        note.addStringProperty("comment");
        note.addDateProperty("date");

    }

}
