public android.view.SurfaceView acquireCamera(android.content.Context context) {
    android.util.Log.v(com.swijaya.galaxytorch.CameraDevice.TAG, "Acquiring camera...");
    assert (mCamera) == null;
    try {
        mCamera = android.hardware.Camera.open();
    } catch (java.lang.RuntimeException e) {
        android.util.Log.e(com.swijaya.galaxytorch.CameraDevice.TAG, e.getLocalizedMessage());
    }
    if ((mCamera) == null) {
        android.util.Log.e(com.swijaya.galaxytorch.CameraDevice.TAG, "Failed to open camera");
        return null;
    }
    return new com.swijaya.galaxytorch.CameraDevice.CameraPreview(context);
}