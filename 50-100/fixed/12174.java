public void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) {
    if ((this.holder.getSurface()) == null) {
        return ;
    }
    try {
        camera.stopPreview();
        camera.setPreviewDisplay(holder);
        camera.startPreview();
    } catch (java.lang.Exception e) {
        android.util.Log.d("Surface Changed", ("Error starting camera preview: " + (e.getMessage())));
    }
}