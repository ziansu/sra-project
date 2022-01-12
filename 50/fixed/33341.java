public static synchronized com.vcredit.cameraHelper.CameraInterface getInstance() {
    if ((com.vcredit.cameraHelper.CameraInterface.mCameraInterface) == null) {
        com.vcredit.cameraHelper.CameraInterface.mCameraInterface = new com.vcredit.cameraHelper.CameraInterface();
    }
    return com.vcredit.cameraHelper.CameraInterface.mCameraInterface;
}