private void openCamera() {
    if ((mCamera) != null) {
        releaseCamera();
    }
    mCamera = android.hardware.Camera.open(mCameraId);
    mCameraParameters = mCamera.getParameters();
    adjustCameraParameters();
    mCamera.setDisplayOrientation(calculateCameraRotation(mDisplayOrientation));
    mCallback.onCameraOpened();
}