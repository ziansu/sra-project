public void updateReviewScore(java.lang.String id, double score) {
    database.getCollection("reviews").updateOne(new org.bson.Document("_id", new org.bson.types.ObjectId(id)), new org.bson.Document("$set", new org.bson.Document("score", score)));
}