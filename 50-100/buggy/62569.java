private void setDefaultCameraId() {
    numberOfCameras = android.hardware.Camera.getNumberOfCameras();
    int camId = (defaultCamera.equals("front")) ? Camera.CameraInfo.CAMERA_FACING_FRONT : Camera.CameraInfo.CAMERA_FACING_BACK;
    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
    for (int i = 0; i < (numberOfCameras); i++) {
        android.hardware.Camera.getCameraInfo(i, cameraInfo);
        if ((cameraInfo.facing) == camId) {
            defaultCameraId = camId;
            break;
        }
    }
}