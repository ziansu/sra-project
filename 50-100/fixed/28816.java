public void closeCamera() {
    if ((camera) != null) {
        if (isFlashOn) {
            try {
                turnOffFlash();
            } catch (java.io.IOException e) {
                android.util.Log.e("Closing camera", "Can't turn of the flash properly", e);
            }
        }
        camera.release();
    }
}