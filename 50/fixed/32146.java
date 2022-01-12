private static double getApproximateMaxSize(int maxSizeFromConfig) {
    return ((1.0 * maxSizeFromConfig) * (com.hazelcast.map.impl.eviction.MaxSizeChecker.EVICTION_START_THRESHOLD_PERCENTAGE)) / (com.hazelcast.map.impl.eviction.MaxSizeChecker.ONE_HUNDRED_PERCENT);
}