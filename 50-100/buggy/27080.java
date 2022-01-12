private void unwrapAndAddToIndex(java.lang.Object newValue, com.hazelcast.query.impl.QueryableEntry record) {
    if (newValue instanceof com.hazelcast.query.extractor.MultiResult) {
        multiResultHasToDetectDuplicates = true;
        java.util.List<java.lang.Object> results = ((com.hazelcast.query.extractor.MultiResult) (newValue)).getResults();
        for (java.lang.Object o : results) {
            java.lang.Comparable sanitizedValue = sanitizeValue(((java.lang.Comparable) (o)));
            newIndexInternal(sanitizedValue, record);
        }
    }else {
        java.lang.Comparable sanitizedValue = sanitizeValue(((java.lang.Comparable) (newValue)));
        newIndexInternal(sanitizedValue, record);
    }
}