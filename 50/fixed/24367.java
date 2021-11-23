@java.lang.Override
void start() {
    synchronized(this) {
        setFacing(mFacing);
        openCamera();
        if (mPreview.isReady())
            setupPreview();
        
        mCamera.startPreview();
    }
}