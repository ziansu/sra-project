@java.lang.Override
public void render(float delta) {
    update(delta);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    game.batch.begin();
    game.batch.setProjectionMatrix(camera.combined);
    background.render(game.batch);
    manager.render(game.batch);
    game.batch.end();
    if ((canDispose) || (manager.canDispose()))
        dispose();
    
}