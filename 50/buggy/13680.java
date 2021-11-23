@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    CameraManager.singleInstance.close(cameraIndex);
    callbackThread.quit();
}