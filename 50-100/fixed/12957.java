private void unwrapAndRemoveFromIndex(java.lang.Object oldValue, com.hazelcast.nio.serialization.Data indexKey) {
    if (oldValue instanceof com.hazelcast.query.extractor.MultiResult) {
        java.util.List<java.lang.Object> results = ((com.hazelcast.query.extractor.MultiResult) (oldValue)).getResults();
        for (java.lang.Object o : results) {
            java.lang.Comparable sanitizedValue = sanitizeValue(o);
            removeIndexInternal(sanitizedValue, indexKey);
        }
    }else {
        java.lang.Comparable sanitizedValue = sanitizeValue(oldValue);
        removeIndexInternal(sanitizedValue, indexKey);
    }
}