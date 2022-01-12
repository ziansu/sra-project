public void update() {
    timePassed = (java.lang.System.currentTimeMillis()) - (lastTime);
    if (((timePassed) > (millisecondsPerFrame)) && (!(still))) {
        currentFrame = ((currentFrame) + 1) % (frames);
        lastTime = java.lang.System.currentTimeMillis();
    }
}