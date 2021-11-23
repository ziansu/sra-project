@java.lang.Override
public V put(V value) {
    if (value != null) {
        lastMetCache.put(value, value);
        return value;
    }
    return null;
}