@java.lang.Override
public V put(final java.lang.String key, final V value) {
    final V oldValue = get(key);
    mObject.property(key, value);
    return oldValue;
}