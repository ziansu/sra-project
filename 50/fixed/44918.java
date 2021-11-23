void drawLowResolution() {
    if ((state) != (com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.NOT_INITIALIZED)) {
        synchronized(viewPort) {
            drawLowResolutionBackground(viewPort.getBitmap(), viewPort.getWindow());
        }
    }
}