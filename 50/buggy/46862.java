@java.lang.Override
public void put(java.lang.String cacheName, java.lang.Object key, java.lang.Object value) {
    redis.set(buildKey(cacheName, key), value);
}