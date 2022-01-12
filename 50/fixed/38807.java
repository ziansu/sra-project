@java.lang.Override
public void merge(byte[] key, byte[] value) {
    merge(nativeHandle_, key, key.length, value, value.length);
}