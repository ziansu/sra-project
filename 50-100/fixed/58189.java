@java.lang.Override
public void surfaceChanged(final android.view.SurfaceHolder holder, int format, int width, int height) {
    if ((holder.getSurface()) == null) {
        return ;
    }
    try {
        camera.setPreviewDisplay(holder);
        handler.post(startPreview);
    } catch (java.lang.Exception e) {
        android.util.Log.d(com.bitsorific.findyourthings.activity.ViewItemActivity.TAG, ("Error starting camera preview: " + (e.getMessage())));
    }
}