private void openCamera() {
    if ((mCamera) != null) {
        releaseCamera();
    }
    try {
        mCamera = android.hardware.Camera.open(mCameraId);
        mCameraParameters = mCamera.getParameters();
        adjustCameraParameters();
        mCamera.setDisplayOrientation(calculateCameraRotation(mDisplayOrientation));
        mCallback.onCameraOpened();
    } catch (java.lang.Exception e) {
        mCallback.onCameraFailed();
        e.printStackTrace();
    }
}