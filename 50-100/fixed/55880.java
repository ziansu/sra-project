private boolean isEvictableFreeHeapSize(final com.hazelcast.map.impl.MapContainer mapContainer) {
    final long currentFreeHeapSize = getAvailableMemory();
    final com.hazelcast.config.MaxSizeConfig maxSizeConfig = mapContainer.getMapConfig().getMaxSizeConfig();
    final double minFreeHeapSize = com.hazelcast.map.impl.eviction.MaxSizeChecker.getApproximateMaxSize(maxSizeConfig.getSize());
    return minFreeHeapSize > ((1.0 * currentFreeHeapSize) / (com.hazelcast.map.impl.eviction.MaxSizeChecker.ONE_MEGABYTE));
}