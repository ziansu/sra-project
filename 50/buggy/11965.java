@android.support.annotation.RequiresPermission(value = Manifest.permission.CAMERA)
private void startIfReady() throws java.io.IOException, java.lang.SecurityException {
    if ((mStartRequested) && (mSurfaceAvailable)) {
        mCameraSource.start(mSurfaceView.getHolder());
        mStartRequested = false;
    }
}