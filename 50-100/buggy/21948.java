public void compute(float deltaTime, boolean actionKeyDown) {
    if ((oldFPS) != (Gdx.graphics.getFramesPerSecond())) {
        if ((fontCache) != null)
            removeMessage(fontCache);
        
        fontCache = addMessage(("FPS: " + (Gdx.graphics.getFramesPerSecond())), colorBits, horiAlign, vertAlign, 5.0F);
    }
}