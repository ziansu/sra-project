public static com.mongodb.DB createDbMock() {
    com.mongodb.DB db = org.mockito.Mockito.mock(com.mongodb.DB.class);
    com.bill.rss.mongodb.MongoDBConnection.setDbConnection(db);
    return db;
}