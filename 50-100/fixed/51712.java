public com.mongodb.BasicDBObject findOne(com.mongodb.BasicDBObject query) {
    com.mongodb.DBCursor iterator = null;
    iterator = collection.find(query);
    if (iterator.hasNext()) {
        return ((com.mongodb.BasicDBObject) (iterator.next()));
    }else {
        return null;
    }
}