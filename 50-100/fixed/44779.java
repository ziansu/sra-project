public void advanceFrame() {
    if ((state) == (zedly.luma.LumaCanvas.CanvasState.DORMANT)) {
        return ;
    }
    if (((java.lang.System.currentTimeMillis()) - (lastUseTime)) > 1800000) {
        backBuffer = null;
        frameIndex = 0;
        state = zedly.luma.LumaCanvas.CanvasState.DORMANT;
    }
    if ((frames) != 0) {
        frameIndex = ((frameIndex) + 1) % (frames);
    }
}