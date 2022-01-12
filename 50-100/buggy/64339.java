public void add(java.lang.String id, com.couchbase.client.java.Bucket bucket, java.lang.Object object) throws com.fasterxml.jackson.core.JsonProcessingException {
    java.util.Objects.requireNonNull(id);
    java.util.Objects.requireNonNull(bucket);
    java.util.Objects.requireNonNull(object);
    com.couchbase.client.java.document.json.JsonObject jsonObject = com.couchbase.client.java.document.json.JsonObject.fromJson(ofsObjectMapper.writeValueAsString(object));
    com.couchbase.client.java.document.JsonDocument jsonDocument = com.couchbase.client.java.document.JsonDocument.create(id, jsonObject);
    couchbaseFactory.getUserBucket().insert(jsonDocument);
}