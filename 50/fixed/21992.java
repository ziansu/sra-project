@java.lang.Override
public void invalidate() {
    super.invalidate();
    if (null != (mImageSdk)) {
        mImageSdk.swapBuffer();
        mImageSdk.invalidate();
    }
}