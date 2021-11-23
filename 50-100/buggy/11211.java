@java.lang.Override
public void onPreviewFrame(byte[] data, android.hardware.Camera camera) {
    if (camera == null)
        return ;
    
    float step = camera.getParameters().getExposureCompensationStep();
    EV = java.lang.Math.max(step, (step * (camera.getParameters().getExposureCompensation())));
}