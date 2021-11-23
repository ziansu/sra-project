@java.lang.Override
public void restore(byte[] key, byte[] value) {
    if (value == null) {
        put(serdes.keyFrom(key), null);
    }else {
        put(serdes.keyFrom(key), serdes.valueFrom(value));
    }
}