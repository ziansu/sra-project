public synchronized org.json.JSONObject getTokenData(java.lang.String pseudonym) {
    com.mongodb.client.MongoCollection<org.bson.Document> collection = var.StorageProviderMongoDB.database.getCollection("token");
    org.bson.Document tokenData = collection.find(com.mongodb.client.model.Filters.eq("pseudonym", pseudonym)).first();
    if (tokenData == null) {
        return null;
    }else
        return new org.json.JSONObject(tokenData.toString());
    
}