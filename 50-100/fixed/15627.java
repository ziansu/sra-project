public void redrawCanvas() {
    android.graphics.Canvas canvas = surfaceView.getHolder().lockCanvas();
    if (canvas != null) {
        synchronized(surfaceView.getHolder()) {
            drawTime(canvas);
        }
        surfaceView.getHolder().unlockCanvasAndPost(canvas);
    }
}