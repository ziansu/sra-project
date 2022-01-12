public void update() {
    if (!(animations.isEmpty())) {
        java.lang.System.out.println("updating animations");
        if (((java.lang.System.currentTimeMillis()) - (lastUpdateTime)) >= (durations.get(currentFrame))) {
            if ((currentFrame) == (animations.size())) {
                currentFrame = 0;
            }else {
                (currentFrame)++;
            }
            gid = animations.get(currentFrame);
            lastUpdateTime = java.lang.System.currentTimeMillis();
        }
    }
}