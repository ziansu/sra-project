@java.lang.Override
public java.lang.Object next() {
    if (cursor.step()) {
        byte[] key = cursor.get_key(false);
        byte[] value = cursor.get_value(false);
        com.yahoo.ads.pb.kafka.KeyValue keyValue = new com.yahoo.ads.pb.kafka.KeyValue();
        keyValue.key = key;
        keyValue.value = value;
        com.yahoo.ads.pb.store.PistachiosTkIterator.threadByteBuffer.get().clear();
        kryo.writeObject(com.yahoo.ads.pb.store.PistachiosTkIterator.threadByteBuffer.get(), keyValue);
        return com.yahoo.ads.pb.store.PistachiosTkIterator.threadByteBuffer.get().toBytes();
    }
    return null;
}