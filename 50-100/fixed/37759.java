private java.util.Map<java.lang.String, java.lang.Long> getCountsMap(long owningBucketOrdinal) {
    java.util.HashMap<java.lang.String, java.lang.Long> countsMap = new java.util.HashMap<java.lang.String, java.lang.Long>();
    for (java.util.Map.Entry<java.lang.String, org.elasticsearch.common.util.LongArray> entry : metricCountsMap.entrySet()) {
        long count = (owningBucketOrdinal >= (entry.getValue().size())) ? 0L : entry.getValue().get(owningBucketOrdinal);
        countsMap.put(entry.getKey(), count);
    }
    return countsMap;
}