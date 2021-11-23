public void setAutoFocusCallback(android.hardware.Camera.AutoFocusCallback autoFocusCallback) {
    this.autoFocusCallback = autoFocusCallback;
    mCamera.autoFocus(autoFocusCallback);
}