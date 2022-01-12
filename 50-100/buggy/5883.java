@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0.5F, 0.5F, 0.5F, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    viewport.setScreenPosition(0, 0);
    camera.update();
    stage.act(delta);
    hud.act(delta);
    stage.draw();
    hud.draw();
}