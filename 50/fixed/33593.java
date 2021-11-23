private void stopPreviewAndFreeCamera() {
    if ((mCamera) != null) {
        mCamera.stopPreview();
        mCamera.release();
    }
}