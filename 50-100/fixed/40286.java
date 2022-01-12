private static int findCamera(android.hardware.Camera.CameraInfo cameraInfo) {
    int cameraId = android.hardware.Camera.getNumberOfCameras();
    while ((cameraId--) > 0) {
        android.hardware.Camera.getCameraInfo(cameraId, cameraInfo);
        if ((cameraId == 0) || ((cameraInfo.facing) == (android.hardware.Camera.CameraInfo.CAMERA_FACING_BACK)))
            break;
        
    } 
    return cameraId;
}