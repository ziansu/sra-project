@java.lang.Override
public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int width, int height) {
    setSize(width, height);
    dispatchSurfaceChanged();
    setTruePreviewSize(mTrueWidth, mTrueHeight);
}