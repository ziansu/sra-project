private java.util.Map<java.lang.String, java.lang.Long> getCountsMap(long owningBucketOrdinal) {
    java.util.HashMap<java.lang.String, java.lang.Long> countsMap = new java.util.HashMap<java.lang.String, java.lang.Long>();
    for (java.util.Map.Entry<java.lang.String, org.elasticsearch.common.util.LongArray> entry : metricCountsMap.entrySet())
        countsMap.put(entry.getKey(), entry.getValue().get(owningBucketOrdinal));
    
    return countsMap;
}