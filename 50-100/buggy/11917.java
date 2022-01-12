private void createIndexForPost() {
    try {
        if (!(DS.mop.collectionExists("post"))) {
            DS.mop.createCollection("post");
            com.mongodb.DBObject textIndex = new com.mongodb.BasicDBObject("message", "text");
            textIndex.put("link", "text");
            textIndex.put("name", "text");
            DS.mop.getCollection("post").createIndex(textIndex);
        }
    } catch (java.lang.Exception e) {
        bootstrap.Logger.debug(("error on index post" + (e.getMessage())));
    }
}