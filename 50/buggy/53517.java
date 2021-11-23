@java.lang.Override
public void setAutoFocus(java.lang.String focus) {
    parameters.setFocusMode(focus);
    mCamera.autoFocus(autoFocusCallback);
}