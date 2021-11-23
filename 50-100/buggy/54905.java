private boolean isEvictableFreeHeapPercentage(final com.hazelcast.map.impl.MapContainer mapContainer) {
    final long currentFreeHeapSize = getAvailableMemory();
    final com.hazelcast.config.MaxSizeConfig maxSizeConfig = mapContainer.getMapConfig().getMaxSizeConfig();
    final int freeHeapPercentage = com.hazelcast.map.impl.eviction.MaxSizeChecker.getApproximateMaxSize(maxSizeConfig.getSize());
    final long total = getTotalMemory();
    return freeHeapPercentage > (((1.0 * (com.hazelcast.map.impl.eviction.MaxSizeChecker.ONE_HUNDRED_PERCENT)) * currentFreeHeapSize) / total);
}