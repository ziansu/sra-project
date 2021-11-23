public com.mongodb.DBCursor GetEvents() {
    return this.eventsCollection.find(new com.mongodb.BasicDBObject("mutations.type", "added")).sort(new com.mongodb.BasicDBObject("timeStamp", 1));
}