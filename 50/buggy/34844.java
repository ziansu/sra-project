@java.lang.Override
public V put(final K key, final V value) {
    final V oldValue = get(key);
    mObject.property(key.toString(), value);
    return oldValue;
}