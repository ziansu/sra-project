private boolean isEvictableHeapSize(final com.hazelcast.map.impl.MapContainer mapContainer) {
    final long usedHeapSize = getUsedHeapSize(mapContainer);
    if (usedHeapSize == (-1L)) {
        return false;
    }
    final com.hazelcast.config.MaxSizeConfig maxSizeConfig = mapContainer.getMapConfig().getMaxSizeConfig();
    final int maxSize = com.hazelcast.map.impl.eviction.MaxSizeChecker.getApproximateMaxSize(maxSizeConfig.getSize());
    return maxSize < (usedHeapSize / (com.hazelcast.map.impl.eviction.MaxSizeChecker.ONE_MEGABYTE));
}