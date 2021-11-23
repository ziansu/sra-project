private static void createNFCDevice() {
    database.DatabaseCreator.NFCDevice = database.DatabaseCreator.schema.addEntity("NFCDevice");
    database.DatabaseCreator.NFCDevice.addIdProperty();
    database.DatabaseCreator.NFCDevice.addStringProperty("deviceId");
    de.greenrobot.daogenerator.Property kidActivityId = database.DatabaseCreator.NFCDevice.addLongProperty("kidActivityId").getProperty();
    database.DatabaseCreator.NFCDevice.addToOne(database.DatabaseCreator.kidActivity, kidActivityId);
}