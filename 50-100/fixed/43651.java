public void start() {
    if ((videoClip) == null) {
        java.lang.System.err.println(((this.videoClip) + " NULL"));
        return ;
    }
    videoClip.play();
    videoClip.jump(videoStartPos);
    startTime = applet.millis();
}