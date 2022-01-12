@java.lang.Override
public void remove(byte[] key) {
    remove(nativeHandle_, key, key.length);
}