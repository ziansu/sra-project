synchronized void invalidate() {
    state = com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.IS_INITIALIZED;
    cacheThread.interrupt();
}