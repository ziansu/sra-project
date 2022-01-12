@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    CameraManager.singleInstance.close(cameraIndex);
    if ((callbackThread) != null) {
        callbackThread.quit();
    }
}