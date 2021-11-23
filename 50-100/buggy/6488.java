@java.lang.Override
public V put(K key, V value) {
    V old = super.put(key, value);
    super.put(key, value);
    putCount += 1;
    if ((putCount) > (maxCacheSize)) {
        putCount = 0;
        map.poll();
    }
    return old;
}