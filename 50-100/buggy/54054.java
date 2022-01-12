private void removeOldIndices() {
    com.seyren.mongo.MongoStore.LOGGER.info("Dropping old indices");
    try {
        getAlertsCollection().dropIndex(new com.mongodb.BasicDBObject("checkId", 1).append("target", 1));
    } catch (com.mongodb.MongoCommandException e) {
        if ((e.getCode()) != 27) {
            throw e;
        }
    }
}