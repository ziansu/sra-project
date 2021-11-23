public void setWB(java.lang.String wbValue) {
    if ((mCamera) == null) {
        return ;
    }
    android.hardware.Camera.Parameters parameters = mCamera.getParameters();
    if (wbValue == null) {
        return ;
    }
    android.util.Log.e(com.terrydr.eyeScope.CameraView.TAG, ("wbValue:" + wbValue));
    parameters.setWhiteBalance(wbValue);
    mCamera.setParameters(parameters);
}