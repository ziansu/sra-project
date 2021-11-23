private void setFlashlightOn() {
    params = camera.getParameters();
    params.setFlashMode(Parameters.FLASH_MODE_TORCH);
    camera.setParameters(params);
    camera.startPreview();
    isFlashlightOn = true;
}