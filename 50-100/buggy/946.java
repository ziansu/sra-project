public void update() {
    if (!(isPlaying)) {
        return ;
    }
    if (((java.lang.System.currentTimeMillis()) - (lastFrame)) > ((frameTime) * 1000)) {
        (frameIndex)++;
        frameIndex = ((frameIndex) > (frames.length)) ? 0 : frameIndex;
        lastFrame = setLastFrame();
    }
}