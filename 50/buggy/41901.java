@java.lang.Override
public void remove(byte[] key) {
    assert isOwningHandle();
    remove(nativeHandle_, key, key.length);
}