@java.lang.Override
public void process(K key, org.apache.kafka.streams.kstream.internals.Change<V> change) {
    V newValue = computeValue(key, change.newValue);
    V oldValue = (sendOldValues) ? computeValue(key, change.oldValue) : null;
    org.apache.kafka.streams.kstream.internals.KTableFilter.KTableFilterProcessor.context().forward(key, new org.apache.kafka.streams.kstream.internals.Change(newValue, oldValue));
}