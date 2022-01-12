public void onFocus(android.graphics.Point point) {
    mCamera.cancelAutoFocus();
    android.hardware.Camera.Parameters parameters = mCamera.getParameters();
    if ((parameters.getMaxNumFocusAreas()) <= 0) {
        mCamera.autoFocus(autoFocusCallback);
        return ;
    }
    mCamera.autoFocus(autoFocusCallback);
}