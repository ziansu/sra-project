private void TurnOnFlash() {
    if (!(FlashOn)) {
        if (((myCamera) == null) || ((myParameters) == null)) {
            return ;
        }
        myParameters = myCamera.getParameters();
        myParameters.setFlashMode(Parameters.FLASH_MODE_TORCH);
        myCamera.setParameters(myParameters);
        myCamera.startPreview();
        FlashOn = true;
    }
}