synchronized void invalidate() {
    setState(com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.IS_INITIALIZED);
    cacheThread.interrupt();
}