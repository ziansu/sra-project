@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    game.getStateManager().update(delta);
    updateUI();
    stage.act(delta);
    stage.draw();
}