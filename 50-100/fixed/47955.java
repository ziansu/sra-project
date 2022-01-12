public boolean acquireCamera() {
    android.util.Log.v(com.swijaya.galaxytorch.CameraDevice.TAG, "Acquiring camera...");
    assert (mCamera) == null;
    try {
        mCamera = android.hardware.Camera.open();
    } catch (java.lang.RuntimeException e) {
        android.util.Log.e(com.swijaya.galaxytorch.CameraDevice.TAG, e.getLocalizedMessage());
    }
    if ((mCamera) == null) {
        android.util.Log.e(com.swijaya.galaxytorch.CameraDevice.TAG, "Failed to open camera");
        return false;
    }
    return true;
}