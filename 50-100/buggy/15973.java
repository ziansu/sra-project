private void ensureMinIdle(final K key) throws java.lang.Exception {
    final org.apache.commons.pool2.impl.GenericKeyedObjectPool<K, T>.ObjectDeque<T> objectDeque = poolMap.get(key);
    final int deficit = calculateDeficit(objectDeque);
    for (int i = 0; (i < deficit) && ((calculateDeficit(objectDeque)) > 0); i++) {
        addObject(key);
    }
}