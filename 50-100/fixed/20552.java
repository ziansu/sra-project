public boolean useOffheapEntry() {
    if ((cacheCfg) == null) {
        log.info((">>>>>>> Cache cfg is null for cache: " + (cacheName)));
        org.apache.ignite.internal.util.typedef.internal.U.dumpThreads(log);
    }
    return ((cacheCfg.getMemoryMode()) == (org.apache.ignite.cache.CacheMemoryMode.OFFHEAP_TIERED)) || ((cacheCfg.getMemoryMode()) == (org.apache.ignite.cache.CacheMemoryMode.OFFHEAP_VALUES));
}