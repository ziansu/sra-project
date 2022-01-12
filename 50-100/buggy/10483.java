@java.lang.Override
protected java.lang.Boolean doInBackground(java.lang.String... params) {
    com.mongodb.MongoClientURI mongoUri = new com.mongodb.MongoClientURI(tasks.CallEvacuationTask.DBAdress);
    com.mongodb.MongoClient mongoClient = new com.mongodb.MongoClient(mongoUri);
    com.mongodb.client.MongoDatabase db = mongoClient.getDatabase(mongoUri.getDatabase());
    com.mongodb.client.MongoCollection<com.mongodb.BasicDBObject> dbCollection = db.getCollection(tasks.CallEvacuationTask.collectionName, com.mongodb.BasicDBObject.class);
    boolean result = updateEvac(dbCollection, params[1], params[0]);
    return result;
}