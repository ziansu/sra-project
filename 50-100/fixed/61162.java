@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor((255 / 255.0F), (255 / 255.0F), (255 / 255.0F), 1.0F);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    before.draw();
    after.draw();
    before.act(delta);
    after.act(delta);
}