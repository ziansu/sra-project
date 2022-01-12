public com.mongodb.DBCursor GetEvents() {
    return this.eventsCollection.find().sort(new com.mongodb.BasicDBObject("timeStamp", 1));
}