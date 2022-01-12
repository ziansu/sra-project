protected void setFlashMode() {
    android.widget.ImageButton flash = ((android.widget.ImageButton) (findViewById(R.id.flash)));
    if (hasFlash()) {
        java.lang.String mode = Camera.Parameters.FLASH_MODE_OFF;
        switch (stateFlash) {
            case org.geneanet.customcamera.CameraActivity.FLASH_DISABLE :
                mode = Camera.Parameters.FLASH_MODE_OFF;
                break;
            case org.geneanet.customcamera.CameraActivity.FLASH_ENABLE :
                mode = Camera.Parameters.FLASH_MODE_ON;
                break;
            case org.geneanet.customcamera.CameraActivity.FLASH_AUTO :
                mode = Camera.Parameters.FLASH_MODE_AUTO;
                break;
        }
        android.hardware.Camera.Parameters params = customCamera.getParameters();
        params.setFlashMode(mode);
        customCamera.setParameters(params);
    }
}