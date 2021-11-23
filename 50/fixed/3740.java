public static void addOrderItem(models.OrderItems ordItem) {
    models.DBAccessClass db = new models.DBAccessClass();
    db.connectMeIn();
    db.DBaddOrderItem(ordItem);
    db.closeConnection();
}