public static synchronized boolean isCameraUseable(int cameraID) {
    boolean canUse = true;
    android.hardware.Camera mCamera = null;
    try {
        mCamera = android.hardware.Camera.open(cameraID);
        android.hardware.Camera.Parameters mParameters = mCamera.getParameters();
        mCamera.setParameters(mParameters);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        canUse = false;
    } finally {
        if (mCamera != null) {
            mCamera.release();
        }else {
            canUse = false;
        }
    }
    return canUse;
}