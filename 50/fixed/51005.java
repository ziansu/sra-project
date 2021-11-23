@java.lang.Override
void stop() {
    synchronized(this) {
        if ((mCamera) != null)
            mCamera.stopPreview();
        
        mHandler.removeCallbacksAndMessages(null);
        releaseCamera();
    }
}