public java.lang.String findQuery(java.lang.String collection, org.bson.Document docs) {
    try {
        com.mongodb.client.MongoCollection<org.bson.Document> coll = database.getCollection(collection);
        return coll.find(docs).toString();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}