public boolean useOffheapEntry() {
    org.apache.ignite.cache.CacheMemoryMode mode = cacheCfg.getMemoryMode();
    if (mode == null) {
        org.apache.ignite.internal.util.typedef.internal.U.dumpThreads(null);
        if ((log) != null)
            org.apache.ignite.internal.util.typedef.internal.U.dumpThreads(log);
        
    }
    return (mode == (org.apache.ignite.cache.CacheMemoryMode.OFFHEAP_TIERED)) || (mode == (org.apache.ignite.cache.CacheMemoryMode.OFFHEAP_VALUES));
}