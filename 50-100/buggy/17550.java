public static java.lang.String getNameOfBackFacingDevice() {
    for (int i = 0; i < (android.hardware.Camera.getNumberOfCameras()); ++i) {
        android.hardware.Camera.CameraInfo info = new android.hardware.Camera.CameraInfo();
        android.hardware.Camera.getCameraInfo(i, info);
        if ((info.facing) == (Camera.CameraInfo.CAMERA_FACING_BACK))
            return org.webrtc.VideoCapturerAndroid.getDeviceName(i);
        
    }
    throw new java.lang.RuntimeException("Back facing camera does not exist.");
}