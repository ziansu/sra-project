public void update() {
    if (!(animations.isEmpty())) {
        if (((java.lang.System.currentTimeMillis()) - (lastUpdateTime)) >= (durations.get(currentFrame))) {
            if ((currentFrame) == ((animations.size()) - 1)) {
                currentFrame = 0;
            }else {
                (currentFrame)++;
            }
            gid = animations.get(currentFrame);
            lastUpdateTime = java.lang.System.currentTimeMillis();
        }
    }
}