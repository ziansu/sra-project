public void start() {
    if ((videoClip) == null) {
        java.lang.System.err.println(((this.videoClip) + " NULL"));
        return ;
    }
    videoClip.speed(1);
    videoClip.play();
    videoClip.jump(videoStartPos);
    startTime = applet.millis();
}