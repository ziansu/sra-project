public void surfaceCreated(android.view.SurfaceHolder holder) {
    try {
        mCamera.setPreviewDisplay(holder);
        mCamera.startPreview();
    } catch (java.io.IOException e) {
        android.util.Log.d(com.ihy.ihearyou.component.CameraPreview.TAG, ("Error setting camera preview: " + (e.getMessage())));
    }
}