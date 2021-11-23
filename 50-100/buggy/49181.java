public void stop() {
    if ((camera) != null) {
        camera.setPreviewCallback(null);
        camera.stopPreview();
        camera.release();
        camera = null;
        clearSurface(surfaceView.getHolder().getSurface());
        running = false;
    }
}