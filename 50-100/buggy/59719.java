private void turnOffFlash() {
    if (isFlashOn) {
        if (((camera) == null) || ((params) == null)) {
            return ;
        }
        params = camera.getParameters();
        params.setFlashMode(Camera.Parameters.FLASH_MODE_OFF);
        camera.setParameters(params);
        camera.stopPreview();
        isFlashOn = false;
        toggleButtonImage();
    }
}