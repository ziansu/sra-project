@java.lang.Override
public void save(java.lang.String key, T value) {
    if ((key != null) && (value != null)) {
        cache.put(key, value);
    }
}