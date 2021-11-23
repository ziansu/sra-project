public void connect() {
    logger.log(CloudAdapterLogger.Level.INFO, (("Connecting to [" + (mongoUri)) + "]"));
    com.mongodb.MongoClientURI uri = new com.mongodb.MongoClientURI(mongoUri);
    client = new com.mongodb.MongoClient(uri);
    logger.log(CloudAdapterLogger.Level.INFO, (((("Retrieving collection [" + (mongoCollection)) + "] from database [") + (mongoDb)) + "]"));
    db = client.getDatabase(mongoDb);
    collection = db.getCollection(mongoCollection);
}