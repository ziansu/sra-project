public static double getApproximateMaxSize(com.hazelcast.config.MaxSizeConfig maxSizeConfig, com.hazelcast.config.MaxSizeConfig.MaxSizePolicy policy) {
    if ((maxSizeConfig.getMaxSizePolicy()) == policy) {
        return com.hazelcast.map.impl.eviction.MaxSizeChecker.getApproximateMaxSize(maxSizeConfig.getSize());
    }
    return -1.0;
}