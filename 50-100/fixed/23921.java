public void onFocus(android.graphics.Point point) {
    mCamera.cancelAutoFocus();
    if ((mCamera) == null) {
        return ;
    }
    android.hardware.Camera.Parameters parameters = mCamera.getParameters();
    if (parameters == null) {
        return ;
    }
    if ((parameters.getMaxNumFocusAreas()) <= 0) {
        mCamera.autoFocus(autoFocusCallback);
        return ;
    }
    mCamera.autoFocus(autoFocusCallback);
}