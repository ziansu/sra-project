@java.lang.Override
public <K, T> org.specrunner.util.cache.ICache<K, T> newCache(java.lang.String name) {
    return create(name, new org.specrunner.util.cache.ICacheCleaner<T>() {
        @java.lang.Override
        public void destroy(T obj) {
        }
    });
}