public boolean isFlashOn() {
    if (camera1.getFlashMode().equalsIgnoreCase(Camera.Parameters.FLASH_MODE_OFF)) {
        return false;
    }else {
        return true;
    }
}