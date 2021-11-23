@java.lang.Override
public void setSavePoint() {
    assert isOwningHandle();
    setSavePoint0(nativeHandle_);
}