static void removeReference(long addr) {
    synchronized(lib.util.persistent.ObjectCache.class) {
        lib.util.persistent.ObjectCache.cache.remove(addr);
    }
}