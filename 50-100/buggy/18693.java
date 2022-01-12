private int calculateCaptureRotation() {
    int previewRotation = calculatePreviewRotation();
    if ((mCameraInfo.facing) == (Camera.CameraInfo.CAMERA_FACING_FRONT)) {
        return (((previewRotation + 180) + (2 * (mDisplayOrientation))) + 720) % 360;
    }else {
        return previewRotation;
    }
}