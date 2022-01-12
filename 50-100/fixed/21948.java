public void compute(float deltaTime, boolean actionKeyDown) {
    if ((oldFPS) != (Gdx.graphics.getFramesPerSecond())) {
        oldFPS = Gdx.graphics.getFramesPerSecond();
        if ((fontCache) != null)
            removeMessage(fontCache);
        
        fontCache = addMessage(("FPS: " + (oldFPS)), colorBits, horiAlign, vertAlign, 5.0F);
    }
}