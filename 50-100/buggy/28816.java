public void closeCamera() {
    if (isFlashOn) {
        try {
            turnOffFlash();
        } catch (java.io.IOException e) {
            android.util.Log.e("Closing camera", "Can't turn of the flash properly", e);
        }
    }
    if ((camera) != null)
        camera.release();
    
}