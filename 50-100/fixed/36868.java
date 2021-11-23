private static void createConfig(de.greenrobot.daogenerator.Schema schema) {
    com.generator.RaceDaoGen.config = schema.addEntity("Config");
    com.generator.RaceDaoGen.config.addIdProperty().autoincrement().primaryKey();
    com.generator.RaceDaoGen.config.addStringProperty("Comment");
    de.greenrobot.daogenerator.Property carID = com.generator.RaceDaoGen.config.addLongProperty("carID").notNull().getProperty();
    de.greenrobot.daogenerator.ToOne carToConfig = com.generator.RaceDaoGen.config.addToOne(com.generator.RaceDaoGen.car, carID);
}