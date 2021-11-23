public static org.json.simple.JSONArray getAllSensors(java.lang.String collectionName, database.BasicDBObject fields) {
    com.mongodb.client.MongoDatabase db = database.DBConnector.getInstance().getDB();
    com.mongodb.client.MongoCollection<database.BasicDBObject> collection = db.getCollection(collectionName, database.BasicDBObject.class);
    org.json.simple.JSONArray result = new org.json.simple.JSONArray();
    for (database.BasicDBObject document : collection.find().projection(fields)) {
        result.add(document);
    }
    database.DBQuery.LOGGER.debug(result);
    return result;
}