@java.lang.Override
public int count() {
    assert isOwningHandle();
    return count0(nativeHandle_);
}