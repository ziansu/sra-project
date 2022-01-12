@java.lang.Override
public void restore(byte[] key, byte[] value) {
    if (value == null) {
        delete(serdes.keyFrom(key));
    }else {
        put(serdes.keyFrom(key), serdes.valueFrom(value));
    }
}