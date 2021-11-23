public boolean open() {
    com.mongodb.DB db = null;
    com.mongodb.DBCursor cursor = null;
    socks = new com.mongodb.MongoClient(config.getVal("mongo-ip"), java.lang.Integer.parseInt(config.getVal("mongo-port")));
    db = socks.getDB(config.getVal("mongo-db"));
    collection = db.getCollection(config.getVal("mongo-collection"));
}