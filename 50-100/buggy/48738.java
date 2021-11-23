@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.util.Log.d(LT, " - SurfaceHolder: surfaceChanged");
    camera.stopPreview();
    setCameraDisplayOrientation(CAMERA_ID);
    try {
        camera.setPreviewDisplay(holder);
        camera.startPreview();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}