@java.lang.Override
public V put(V value) {
    if (value != null) {
        firstMetCache.add(value);
        return value;
    }
    return null;
}