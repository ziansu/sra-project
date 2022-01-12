public void createDBCollection() {
    try {
        com.censtat.data.tools.DataParserJSONObjectFactory.app.createConnection();
    } catch (java.net.UnknownHostException e) {
        e.printStackTrace();
    }
    if (MongoApp.db.collectionExists("DataEntity")) {
        com.mongodb.DBCollection collection = MongoApp.db.getCollection("DataEntity");
        collection.drop();
        java.lang.System.out.println("Sucessfully dropped the view collection");
    }
    MongoApp.db.createCollection("DataEntity", null);
}