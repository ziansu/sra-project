public synchronized void stopScan() {
    if (!(this.cameraIsRelease)) {
        android.util.Log.v("ScannerRelativeLayout", "stopScan");
        this.setBoolInXml();
        this.mCameraManager.resetCamera();
        if (null != (this.mSurfaceHolder)) {
            this.mSurfaceHolder.removeCallback(this.mInnerSurfaceHolderCallback);
        }
        this.cameraIsRelease = true;
    }
    this.cameraStopPreview = true;
}