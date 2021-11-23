private int calculateCaptureRotation() {
    int previewRotation = calculatePreviewRotation();
    if ((mCameraInfo.facing) == (Camera.CameraInfo.CAMERA_FACING_FRONT)) {
        return ((previewRotation + (2 * (mDisplayOrientation))) + 180) % 360;
    }else {
        return previewRotation;
    }
}