public synchronized void suspend() {
    setState(com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.DISABLED);
}