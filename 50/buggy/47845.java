@java.lang.Override
public void putLogData(byte[] blob) {
    assert isOwningHandle();
    putLogData(nativeHandle_, blob, blob.length);
}