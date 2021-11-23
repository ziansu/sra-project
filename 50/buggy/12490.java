public boolean isFrontCameraAvailable() {
    return cameraPreviewSurface.getContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FRONT);
}