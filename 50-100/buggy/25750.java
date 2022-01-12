@java.lang.Override
public void surfaceCreated(android.view.SurfaceHolder holder) {
    mCamera = android.hardware.Camera.open(0);
    mCameraRecord.setOutputSurface(holder.getSurface());
    mCameraRecord.setOutputSize(480, 640);
    mCameraRecord.setRenderer(this);
    mCameraRecord.startPreview();
}