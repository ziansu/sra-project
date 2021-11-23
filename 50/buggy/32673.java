static void close(final org.ehcache.impl.internal.store.heap.OnHeapStore onHeapStore) {
    onHeapStore.map.clear();
}