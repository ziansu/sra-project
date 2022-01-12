public void setFps() {
    android.hardware.Camera.Parameters params = mCamera.getParameters();
    java.util.ArrayList<int[]> camParams = ((java.util.ArrayList<int[]>) (mCamera.getParameters().getSupportedPreviewFpsRange()));
    int maxFps = 35000;
    params.setPreviewFpsRange(maxFps, maxFps);
    mCamera.setParameters(params);
    setResolution();
}