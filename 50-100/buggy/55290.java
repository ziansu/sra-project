private void invalidate() {
    for (K key : map.keySet()) {
        try {
            invalidate(key);
        } catch (org.ehcache.core.spi.store.StoreAccessException cae) {
            org.ehcache.impl.internal.store.heap.OnHeapStore.LOG.warn("Failed to invalidate mapping for key {}", key, cae);
        }
    }
    clear();
}