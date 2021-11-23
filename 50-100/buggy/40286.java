private static int findCamera(android.hardware.Camera.CameraInfo cameraInfo) {
    int cameraId = (android.hardware.Camera.getNumberOfCameras()) - 1;
    for (; cameraId > 0; cameraId--) {
        android.hardware.Camera.getCameraInfo(cameraId, cameraInfo);
        if ((cameraInfo.facing) == (android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK))
            break;
        
    }
    return cameraId;
}