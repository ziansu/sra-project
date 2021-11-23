private void startCamera() {
    if ((camera) != null) {
        stopCamera();
    }
    camera = android.hardware.Camera.open(cameraId);
    startCameraPreview();
}