protected org.ehcache.transactions.xa.SoftLock<V> copyAfterDeserialization(org.ehcache.spi.serialization.Serializer<V> valueSerializer, org.ehcache.transactions.xa.SoftLock<V> serializedSoftLock) throws java.lang.ClassNotFoundException {
    V oldValue = valueSerializer.read(java.nio.ByteBuffer.wrap(serializedSoftLock.oldValueSerialized));
    org.ehcache.transactions.xa.XAValueHolder<V> newValueHolder = null;
    if ((this.newValueHolder) != null) {
        newValueHolder = this.newValueHolder.copyAfterDeserialization(valueSerializer);
    }
    return new org.ehcache.transactions.xa.SoftLock<V>(transactionId, oldValue, newValueHolder);
}