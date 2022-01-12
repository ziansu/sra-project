public void setWB(java.lang.String wbValue) {
    if ((mCamera) == null) {
        return ;
    }
    android.hardware.Camera.Parameters parameters = mCamera.getParameters();
    if (wbValue == null) {
        return ;
    }
    parameters.setWhiteBalance(wbValue);
    mCamera.setParameters(parameters);
}