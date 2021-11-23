public boolean replace(K key, V oldValue, V newValue, org.ehcache.internal.store.offheap.factories.EhcacheSegmentFactory.ValueComparator<V> comparator) {
    org.ehcache.internal.store.offheap.factories.EhcacheSegmentFactory.EhcacheSegment<K, V> segment = ((org.ehcache.internal.store.offheap.factories.EhcacheSegmentFactory.EhcacheSegment) (org.ehcache.internal.store.offheap.EhcacheConcurrentOffHeapClockCache.segmentFor(key)));
    return segment.replace(key, oldValue, newValue, comparator);
}