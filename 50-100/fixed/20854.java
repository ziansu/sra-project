public void TurnOffFlash() {
    if (FlashOn) {
        if (((myCamera) == null) || ((myParameters) == null)) {
            return ;
        }
        myParameters = myCamera.getParameters();
        myParameters.setFlashMode(Parameters.FLASH_MODE_OFF);
        myCamera.setParameters(myParameters);
        myCamera.stopPreview();
        FlashOn = false;
    }
}