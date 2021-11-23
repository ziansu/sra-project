private void getCamera() {
    if ((myCamera) == null) {
        try {
            myCamera = android.hardware.Camera.open();
            myParameters = myCamera.getParameters();
        } catch (java.lang.RuntimeException e) {
            throw e;
        }
    }
}