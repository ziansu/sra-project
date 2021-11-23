protected <K, V> org.apache.ignite.IgniteCache<K, V> jcache(org.apache.ignite.Ignite ig, java.lang.Class<K> clsK, java.lang.Class<V> clsV) {
    org.apache.ignite.IgniteCache<K, V> cache = jcache(ig, cacheConfiguration(), clsK, clsV);
    return cache;
}