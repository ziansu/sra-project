@android.annotation.TargetApi(value = 11)
private void setUpCameraGingerbread(final android.hardware.Camera camera) {
    mRenderer.setUpSurfaceTexture(camera);
}