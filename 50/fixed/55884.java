void setCamera(org.gearvrf.GVRCamera camera) {
    mCamera = camera;
    org.gearvrf.GVRActivity.nativeSetCamera(appPtr, camera.getNative());
}