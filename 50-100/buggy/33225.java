@java.lang.Override
protected java.lang.Boolean doInBackground(logic.Tent... params) {
    com.mongodb.MongoClientURI mongoUri = new com.mongodb.MongoClientURI(tasks.CheckEvacuationTask.DBAdress);
    com.mongodb.MongoClient mongoClient = new com.mongodb.MongoClient(mongoUri);
    com.mongodb.client.MongoDatabase db = mongoClient.getDatabase(mongoUri.getDatabase());
    com.mongodb.client.MongoCollection<com.mongodb.BasicDBObject> dbCollection = db.getCollection(tasks.CheckEvacuationTask.collectionName, com.mongodb.BasicDBObject.class);
    com.mongodb.client.FindIterable<com.mongodb.BasicDBObject> soldiers = dbCollection.find();
    boolean result = checkAndUpdate(soldiers, params[0]);
    return result;
}