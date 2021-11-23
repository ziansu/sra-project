private java.util.List<com.apollographql.apollo.cache.normalized.Record> valueForObjectList(com.apollographql.apollo.cache.normalized.Record record, com.apollographql.apollo.api.ResponseField field) throws java.io.IOException {
    java.util.List<com.apollographql.apollo.cache.normalized.CacheReference> values = fieldValue(record, field);
    java.util.List<com.apollographql.apollo.cache.normalized.Record> result = new java.util.ArrayList<>();
    for (com.apollographql.apollo.cache.normalized.CacheReference reference : values) {
        result.add(readableCache.read(reference.key(), cacheHeaders));
    }
    return result;
}