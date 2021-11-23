public java.lang.String addItem(java.lang.String collectionName, com.mongodb.BasicDBObject item) {
    com.mongodb.DBCollection tCol = mongoDB.getCollection(collectionName);
    item.put(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_CREATED, new java.util.Date());
    item.remove(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_ID);
    item.remove(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_UPDATED);
    try {
        tCol.insert(item);
    } catch (com.mongodb.MongoException ex) {
        return null;
    }
    return item.getString(mx.edu.cide.justiciacotidiana.v1.mongo.MongoInterface.FIELD_ID);
}