@java.lang.Override
void start() {
    setFacing(mFacing);
    openCamera();
    if (mPreview.isReady())
        setupPreview();
    
    mCamera.startPreview();
}