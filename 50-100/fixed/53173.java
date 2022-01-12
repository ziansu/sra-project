public void createDBCollection() {
    if ((MongoApp.db.getCollection("DataEntity").count()) > 1) {
        com.mongodb.DBCollection collection = MongoApp.db.getCollection("DataEntity");
        collection.drop();
        java.lang.System.out.println("Sucessfully dropped the view collection");
    }
    MongoApp.db.createCollection("DataEntity", null);
}