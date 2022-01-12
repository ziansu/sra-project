public boolean updateItem(java.lang.String collectionName, com.mongodb.BasicDBObject query, com.mongodb.BasicDBObject newData) {
    com.mongodb.DBCollection tCol = mongoDB.getCollection(collectionName);
    newData.put(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_CREATED, query.get(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_CREATED));
    newData.put(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_UPDATED, Utils.isoformater.format(new java.util.Date()));
    newData.remove(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_ID);
    try {
        tCol.update(query, newData);
    } catch (com.mongodb.MongoException ex) {
        return false;
    }
    return true;
}