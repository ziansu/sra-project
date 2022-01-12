public boolean useOffheapEntry() {
    if ((cacheCfg) == null) {
        org.apache.ignite.internal.util.typedef.internal.U.dumpThreads(null);
        if ((log) != null)
            org.apache.ignite.internal.util.typedef.internal.U.dumpThreads(log);
        
    }
    return ((cacheCfg.getMemoryMode()) == (org.apache.ignite.cache.CacheMemoryMode.OFFHEAP_TIERED)) || ((cacheCfg.getMemoryMode()) == (org.apache.ignite.cache.CacheMemoryMode.OFFHEAP_VALUES));
}