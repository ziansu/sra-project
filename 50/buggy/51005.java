@java.lang.Override
void stop() {
    if ((mCamera) != null)
        mCamera.stopPreview();
    
    mHandler.removeCallbacksAndMessages(null);
    releaseCamera();
}