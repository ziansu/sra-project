private void updateSizeEstimatorWithRecords(com.hazelcast.map.impl.NearCacheRecord previous, com.hazelcast.map.impl.NearCacheRecord record) {
    updateSizeEstimator(calculateCost(record));
    if (previous != null) {
        updateSizeEstimator((-(calculateCost(record))));
    }
}