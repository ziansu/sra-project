public void update() {
    timePassed = (java.lang.System.currentTimeMillis()) - (lastTime);
    if (((timePassed) > (millisecondsPerFrame)) && (!(still))) {
        currentFrame = ((currentFrame) + ((int) ((timePassed) / (millisecondsPerFrame)))) % (frames);
        lastTime = java.lang.System.currentTimeMillis();
    }
}