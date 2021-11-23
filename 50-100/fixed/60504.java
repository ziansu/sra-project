@java.lang.Override
public V get(K key, final java.util.concurrent.Callable<? extends V> valueLoader) throws java.util.concurrent.ExecutionException {
    synchronized(key) {
        V value = cache.get(key);
        if (value != null) {
            return value;
        }
        try {
            value = valueLoader.call();
            cache.put(key, value);
            return value;
        } catch (java.lang.Exception e) {
            throw new com.metamx.common.ISE(e, "got an exception while loading key [%s]", key);
        }
    }
}