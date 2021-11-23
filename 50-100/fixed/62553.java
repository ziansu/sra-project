protected org.ehcache.transactions.xa.SoftLock<V> copyForSerialization(org.ehcache.spi.serialization.Serializer<V> valueSerializer) {
    java.nio.ByteBuffer serializedOldValue = null;
    if ((oldValue) != null) {
        serializedOldValue = valueSerializer.serialize(oldValue);
    }
    org.ehcache.transactions.xa.XAValueHolder<V> serializedXaValueHolder = null;
    if ((newValueHolder) != null) {
        serializedXaValueHolder = newValueHolder.copyForSerialization(valueSerializer);
    }
    return new org.ehcache.transactions.xa.SoftLock<V>(transactionId, serializedOldValue, serializedXaValueHolder);
}