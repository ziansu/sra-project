static void removeReference(long addr) {
    lib.util.persistent.ObjectCache.cache.remove(addr);
}