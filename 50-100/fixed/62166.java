@java.lang.Override
public void render(float deltaTime) {
    Gdx.gl.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    if (debugEnabled) {
        debugRebuildStage -= deltaTime;
        if ((debugRebuildStage) <= 0) {
            debugRebuildStage = DEBUG_REBUILD_INTERVAL;
            rebuildStage();
        }
    }
    stage.act(deltaTime);
    stage.draw();
}