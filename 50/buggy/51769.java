@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    android.util.Log.w(org.thoughtcrime.securesms.components.camera.SurfacePreviewStrategy.TAG, "surfaceChanged()");
    cameraView.initPreview();
}