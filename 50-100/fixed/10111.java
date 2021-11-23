public final void setFPS(int fps) {
    if (fps <= 0) {
        throw new java.lang.RuntimeException("Attempted to run a CellGame at a non-positive FPS");
    }
    this.fps = fps;
    msPerFrame = 1000 / ((double) (fps));
    if ((game.getContainer()) != null) {
        game.getContainer().setTargetFrameRate(fps);
    }
}