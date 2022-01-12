@java.lang.Override
public V getOrDefault(java.lang.Object key, V defaultValue) {
    if (key == null) {
        throw new java.lang.NullPointerException("key");
    }
    if ((root) == null) {
        return null;
    }
    return root.get(key.hashCode(), 0, key, defaultValue);
}