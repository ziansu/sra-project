@java.lang.Override
public void put(final org.apache.kafka.common.utils.Bytes key, final byte[] value, final long timestamp) {
    if (key != null) {
        bytesStore.put(key, value, timestamp);
        changeLogger.logChange(org.apache.kafka.streams.state.internals.WindowStoreUtils.toBinaryKey(key, timestamp, maybeUpdateSeqnumForDups(), innerStateSerde), value);
    }
}