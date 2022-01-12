@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    update(delta);
    game.batch.begin();
    background.updateAndRender(delta, game.batch);
    game.batch.end();
    stage.draw();
}