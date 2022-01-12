public void turnOffFlash() throws java.io.IOException {
    if (((camera) == null) || ((parameters) == null)) {
        activateCamera();
    }
    parameters = camera.getParameters();
    parameters.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
    camera.setParameters(parameters);
    camera.stopPreview();
    isFlashOn = false;
}