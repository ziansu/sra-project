@java.lang.Override
public boolean remove(K key, V value) {
    if (!(containsKey(key)))
        return false;
    
    java.util.Set<V> valueList = get(key);
    boolean found = valueList.remove(value);
    if (valueList.isEmpty()) {
        remove(key);
    }
    return found;
}