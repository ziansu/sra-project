public java.lang.String findQuery(java.lang.String collection, org.bson.Document docs) {
    com.mongodb.client.MongoCollection<org.bson.Document> coll = null;
    try {
        coll = database.getCollection(collection);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return coll.find(docs).toString();
}