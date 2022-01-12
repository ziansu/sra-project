private void releaseAll() {
    mSensorManager.unregisterListener(mSensorEventListener);
    if ((mSensorManager) != null)
        mSensorManager = null;
    
    if ((mCamera) != null) {
        mCamera.setPreviewCallback(null);
        mCamera.release();
        mCamera = null;
    }
}