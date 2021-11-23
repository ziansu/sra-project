public java.lang.String read(java.lang.String id) {
    DataManagers.DB db = mongoClient.getDB("test");
    DataManagers.DBCollection col = db.getCollection("test1");
    DataManagers.BasicDBObject query = new DataManagers.BasicDBObject("_id", new org.bson.types.ObjectId(id));
    DataManagers.DBCursor cursor = col.find(query);
    try {
        while (cursor.hasNext()) {
            java.lang.System.out.println(cursor.next().toString());
        } 
    } finally {
        cursor.close();
    }
    return "";
}