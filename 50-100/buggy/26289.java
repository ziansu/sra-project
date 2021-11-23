public void update() {
    (this.frameTicks)++;
    if ((this.frameTicks) >= (this.getCurrentFrame().getDuration())) {
        this.frameCounter = ((this.frameCounter) + 1) % (this.frames.length);
        this.frameTicks = 0;
    }
}