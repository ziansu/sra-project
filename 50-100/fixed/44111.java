@java.lang.Override
public V getOrDefault(java.lang.Object key, V defaultValue) {
    if (key == null) {
        throw new java.lang.NullPointerException("key");
    }
    if ((root) == null) {
        return defaultValue;
    }
    return root.get(key.hashCode(), 0, key, defaultValue);
}