@java.lang.Override
public V replace(K key, V value) {
    V oldValue = kvStore.replace(key, value);
    if (oldValue != null) {
        subscriptions.notifyEvent(net.openhft.chronicle.engine.map.UpdatedEvent.of(asset.fullName(), key, oldValue, value, false, (!(value.equals(oldValue)))));
    }
    return oldValue;
}