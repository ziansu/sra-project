@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    CameraManager.singleInstance.close(backCameraIndex);
    CameraManager.singleInstance.close(frontCameraIndex);
    if ((callbackThread) != null) {
        callbackThread.quit();
    }
}