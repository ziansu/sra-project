@java.lang.Override
public V put(K key, V value) {
    if (value == null) {
        V old = map.remove(key);
        super.remove(key);
        return old;
    }
    V old = map.put(key, value);
    super.get(key);
    super.put(key, value);
    putCount += 1;
    if ((putCount) > (maxCacheSize)) {
        putCount = 0;
        map.poll();
    }
    return old;
}