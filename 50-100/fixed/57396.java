public void mergeEntities(org.apache.avro.generic.GenericRecord data) {
    java.util.List<org.apache.avro.util.Utf8> idsToMerge = ((java.util.List<org.apache.avro.util.Utf8>) (data.get("mergedEntitiesId")));
    java.util.List<java.util.UUID> uuids = new java.util.ArrayList(idsToMerge.size());
    for (java.lang.Object id : idsToMerge) {
        uuids.add(java.util.UUID.fromString(id.toString()));
    }
    mergeEntities(uuids);
}