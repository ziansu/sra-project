@java.lang.Override
public void onTick(long millisUntilFinished) {
    com.almalence.opencam.cameracontroller.Camera2Controller.viewFinderSurface = com.almalence.opencam.cameracontroller.Camera2Controller.appInterface.getCameraSurface();
    if ((com.almalence.opencam.cameracontroller.Camera2Controller.viewFinderSurface) != null) {
        this.cancel();
        surfaceList.add(0, com.almalence.opencam.cameracontroller.Camera2Controller.viewFinderSurface);
        com.almalence.opencam.cameracontroller.Camera2Controller.createCaptureSession(surfaceList);
    }
}