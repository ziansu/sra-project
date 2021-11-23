public static void switchCamera(int cameraId, android.hardware.Camera.PreviewCallback callback, byte[] buffer) {
    if ((com.cgfay.caincamera.utils.CameraUtils.mCameraID) == cameraId) {
        return ;
    }
    com.cgfay.caincamera.utils.CameraUtils.stopPreview();
    com.cgfay.caincamera.utils.CameraUtils.mCameraID = cameraId;
    com.cgfay.caincamera.utils.CameraUtils.releaseCamera();
    com.cgfay.caincamera.utils.CameraUtils.openCamera(cameraId, com.cgfay.caincamera.utils.CameraUtils.DESIRED_PREVIEW_FPS);
    com.cgfay.caincamera.utils.CameraUtils.addPreviewCallbacks(callback, buffer);
}