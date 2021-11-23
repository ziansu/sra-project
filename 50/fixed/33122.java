public void resume() {
    if ((state) == (com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.DISABLED)) {
        synchronized(this) {
            state = com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.IS_INITIALIZED;
        }
    }
}