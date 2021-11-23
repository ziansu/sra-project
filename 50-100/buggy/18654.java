private void lightOn(boolean should) {
    if (Const.DEBUG)
        android.util.Log.v(com.aidanas.torch.MainActivity.TAG, ("In lightOn(), should = " + should));
    
    if (should) {
        cam = android.hardware.Camera.open();
        android.hardware.Camera.Parameters p = cam.getParameters();
        p.setFlashMode(Camera.Parameters.FLASH_MODE_TORCH);
        cam.setParameters(p);
        isLightOn = true;
    }else {
        if ((cam) != null) {
            cam.release();
        }
        isLightOn = false;
    }
}