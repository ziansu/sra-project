public void start() {
    edu.wpi.first.wpilibj.CameraServer.getInstance().startAutomaticCapture(camera);
    detectionThread = createDetectionThread();
    detectionThread.start();
}