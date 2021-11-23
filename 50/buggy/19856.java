private void startCamera() {
    this.camera = new org.opencv.videoio.VideoCapture(0);
    if (!(camera.isOpened())) {
        java.lang.System.err.println("Camera hasnt been found or failed to start...");
    }
    cameraReady = true;
}