private void releaseCamera() {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
        mCamera = null;
        stopBackgroundThread();
        android.util.Log.d(TAG, "releaseCamera -- done");
    }
}