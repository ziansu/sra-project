public void resume() {
    if ((getState()) == (com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.DISABLED)) {
        synchronized(this) {
            setState(com.micabytes.gfx.BitmapSurfaceRenderer.CacheState.IS_INITIALIZED);
        }
    }
}