protected long getOwnedEntryCount(com.hazelcast.core.IMap<java.lang.Integer, java.lang.Integer> map) {
    com.hazelcast.monitor.NearCacheStats stats = map.getLocalMapStats().getNearCacheStats();
    return stats.getOwnedEntryCount();
}