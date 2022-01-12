public com.bugull.mongo.BuguUpdater<T> bitwise(java.lang.String id, java.lang.String key, int value, com.bugull.mongo.BuguUpdater.Bitwise bitwise) {
    com.mongodb.DBObject logic = new com.mongodb.BasicDBObject(checkBitwise(bitwise), value);
    append(Operator.BIT, key, logic);
    return this;
}