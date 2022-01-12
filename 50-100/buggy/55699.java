@java.lang.Override
public java.util.List<java.lang.String> deleteRecordsWithParentId(java.lang.String collectionName, java.lang.String parentIdentity) {
    org.springframework.data.mongodb.core.query.Query query = org.springframework.data.mongodb.core.query.Query.query(createParentCriteria(parentIdentity));
    @java.lang.SuppressWarnings(value = "rawtypes")
    java.util.List<java.util.HashMap> removedRecords = mongoTemplate.findAllAndRemove(query, java.util.HashMap.class, collectionName);
    java.util.List<java.lang.String> recordsIds = new java.util.ArrayList<>();
    for (java.util.Map<?, ?> record : removedRecords) {
        java.lang.String childIdentity = ((java.lang.String) (record.get(ContentDataConstants.IDENTITY_KEY)));
        recordsIds.add(childIdentity);
    }
    return recordsIds;
}