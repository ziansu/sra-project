public void onFocus(android.graphics.Point point, android.hardware.Camera.AutoFocusCallback callback) {
    android.hardware.Camera.Parameters parameters = mCamera.getParameters();
    if ((parameters.getMaxNumFocusAreas()) <= 0) {
        mCamera.autoFocus(callback);
        return ;
    }
    mCamera.autoFocus(callback);
}