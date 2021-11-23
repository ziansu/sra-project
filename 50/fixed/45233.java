@java.lang.Override
public void onOpened(com.holenstudio.excamera2.CameraDevice cameraDevice) {
    mCameraOpenCloseLock.release();
    mCameraDevice = cameraDevice;
    createCameraPreviewSession();
}