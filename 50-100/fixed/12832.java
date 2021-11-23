private void initCamera() {
    try {
        cameraType = ((captureType) == (com.onfido.android.sdk.capture.ui.CaptureType.FACE)) ? Camera.CameraInfo.CAMERA_FACING_FRONT : Camera.CameraInfo.CAMERA_FACING_BACK;
        camera = android.hardware.Camera.open(cameraType);
    } catch (java.lang.Exception e) {
        view.errorLoadingCamera();
    }
    if ((camera) != null) {
        view.init(camera);
    }
}