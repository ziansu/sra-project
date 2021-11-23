public void switchCamera() {
    if (backCamera) {
        backCamera = false;
    }else {
        backCamera = true;
    }
    currentZoom = camera1.getCurrentZoom();
    focusMode = camera1.getFocusMode();
    flashMode = camera1.getFlashMode();
    camera1.stopPreview();
    camera1.releaseCamera();
    isFocusModeSupported = false;
    openCameraAndStartPreview();
}