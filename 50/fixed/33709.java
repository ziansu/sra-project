public static com.mongodb.DB getDbConnection() {
    if ((com.bill.rss.mongodb.MongoDBConnection.dbConnection) != null) {
        return com.bill.rss.mongodb.MongoDBConnection.dbConnection;
    }
    return com.bill.rss.mongodb.MongoDBConnection.createNewDbConnection();
}