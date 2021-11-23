@org.jetbrains.annotations.Nullable
@java.lang.Override
public V getAndPut(K key, V value) {
    V oldValue = kvStore.getAndPut(key, value);
    subscriptions.notifyEvent((oldValue == null ? net.openhft.chronicle.engine.map.InsertedEvent.of(asset.fullName(), key, value, false) : net.openhft.chronicle.engine.map.UpdatedEvent.of(asset.fullName(), key, oldValue, value, false, oldValue.equals(value))));
    return oldValue;
}