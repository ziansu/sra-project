private void setDefaultCameraId() {
    numberOfCameras = android.hardware.Camera.getNumberOfCameras();
    int camId = Camera.CameraInfo.CAMERA_FACING_BACK;
    if (((defaultCamera) != null) && (defaultCamera.equals("front"))) {
        camId = Camera.CameraInfo.CAMERA_FACING_FRONT;
    }
    android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
    for (int i = 0; i < (numberOfCameras); i++) {
        android.hardware.Camera.getCameraInfo(i, cameraInfo);
        if ((cameraInfo.facing) == camId) {
            defaultCameraId = camId;
            break;
        }
    }
}