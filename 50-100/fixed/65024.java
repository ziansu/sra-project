private void initCamera() {
    mCamera = com.cuonghuynh.camera.CameraManager.getInstance().getCameraInstance(mCameraType);
    if ((mCamera) != null) {
        mCamera.setDisplayOrientation(90);
        android.hardware.Camera.Parameters parameters = mCamera.getParameters();
        android.hardware.Camera.Size previewSize = parameters.getPreviewSize();
        mPreviewWidth = previewSize.height;
        mPreviewHeight = previewSize.width;
    }else {
        mPreviewHeight = 1;
        mPreviewWidth = 1;
    }
}