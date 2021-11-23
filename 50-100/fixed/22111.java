@java.lang.Override
public java.util.Set<java.lang.String> getBusinessId(java.lang.String state, java.lang.String category) {
    java.util.Set<java.lang.String> set = new java.util.HashSet<>();
    com.mongodb.client.FindIterable<org.bson.Document> iterable = db.getCollection("restaurants").find(com.mongodb.client.model.Filters.regex("categories", category));
    iterable.forEach(new com.mongodb.Block<org.bson.Document>() {
        @java.lang.Override
        public void apply(final org.bson.Document document) {
            set.add(document.getString("business_id"));
        }
    });
    return set;
}