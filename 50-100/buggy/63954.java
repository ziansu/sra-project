public void update() {
    if (this.playedOnce)
        return ;
    
    long elapsed = ((java.lang.System.nanoTime()) - (this.startTime)) / 1000000;
    if (elapsed > (delay)) {
        (this.currentFrame)++;
        this.startTime = java.lang.System.nanoTime();
    }
    if ((this.currentFrame) == (com.example.jacek.streamthegame.Animation.ANIMATION_FRAMES)) {
        this.playedOnce = true;
        this.currentFrame = (com.example.jacek.streamthegame.Animation.ANIMATION_FRAMES) - 1;
    }
}