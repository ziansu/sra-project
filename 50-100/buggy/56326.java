private static void createAction() {
    database.DatabaseCreator.action = database.DatabaseCreator.schema.addEntity("Action");
    database.DatabaseCreator.action.addIdProperty();
    database.DatabaseCreator.action.addStringProperty("name");
    database.DatabaseCreator.action.addStringProperty("imgUrl");
    database.DatabaseCreator.action.addIntProperty("orderNumber");
    de.greenrobot.daogenerator.Property kidActivityId = database.DatabaseCreator.action.addLongProperty("kidActivityId").getProperty();
    database.DatabaseCreator.action.addToOne(database.DatabaseCreator.kidActivity, kidActivityId);
    database.DatabaseCreator.kidActivity.addToOne(database.DatabaseCreator.action, kidActivityId);
}