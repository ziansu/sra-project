public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((camera) != null) {
        camera.stopPreview();
    }
}