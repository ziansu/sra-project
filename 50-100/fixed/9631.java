public void switchCamera() {
    if (backCamera) {
        backCamera = false;
    }else {
        backCamera = true;
    }
    focusMode = camera1.getFocusMode();
    flashMode = camera1.getFlashMode();
    camera1.stopPreview();
    camera1.releaseCamera();
    isFocusModeSupported = false;
    openCameraAndStartPreview();
}