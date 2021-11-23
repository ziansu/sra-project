@java.lang.Override
public void invalidate() {
    super.invalidate();
    mImageSdk.swapBuffer();
    mImageSdk.invalidate();
}