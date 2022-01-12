@java.lang.Override
public void surfaceChanged(final android.view.SurfaceHolder holder, final int format, final int w, final int h) {
    if ((mCamera) != null) {
        android.hardware.Camera.Parameters parameters = mCamera.getParameters();
        parameters.setPreviewSize(mPreviewSize.width, mPreviewSize.height);
        requestLayout();
        mCamera.setParameters(parameters);
        mCamera.startPreview();
    }
}