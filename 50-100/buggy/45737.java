public void ensureIndex(com.mongodb.DBCollection collection, java.util.List<com.mongodb.DBObject> dynamicIndex) {
    collection.dropIndexes();
    if ((dynamicIndex != null) && (!(dynamicIndex.isEmpty()))) {
        for (com.mongodb.DBObject index : dynamicIndex) {
            org.apache.camel.component.mongodb.MongoDbEndpoint.LOG.debug("create BDObject Index {}", index);
            collection.createIndex(index);
        }
    }
}