public void surfaceChanged(android.view.SurfaceHolder holder, int format, int w, int h) {
    android.util.Log.d("surfaceChanged", "surfaceChanged");
    refreshCamera(holder, mCamera);
}