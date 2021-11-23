@java.lang.Override
public boolean remove(final java.lang.Object key, final java.lang.Object value) {
    if (!(containsKey(key)))
        return false;
    
    final java.util.Set<V> valueList = get(key);
    final boolean found = valueList.remove(value);
    if (valueList.isEmpty()) {
        remove(key);
    }
    return found;
}