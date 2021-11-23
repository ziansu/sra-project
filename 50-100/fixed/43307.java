public void doShiftCamera(android.view.SurfaceHolder holder) {
    if (null != (mCamera)) {
        int numberOfCameras = android.hardware.Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo cameraInfo = new android.hardware.Camera.CameraInfo();
        for (int i = 0; i < numberOfCameras; i++) {
            android.hardware.Camera.getCameraInfo(i, cameraInfo);
            if ((cameraInfo.facing) != (cameraDirect)) {
                doStopCamera();
                mCamera = android.hardware.Camera.open(i);
                cameraDirect = cameraInfo.facing;
                doStartPreview(holder);
                break;
            }
        }
    }
}