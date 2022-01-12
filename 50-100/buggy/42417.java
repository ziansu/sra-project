@java.lang.Override
public void render(float delta) {
    input(delta);
    Gdx.gl.glClearColor((((float) (204)) / 256), (((float) (102)) / 256), 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    batch.begin();
    batch.draw(bg, 0, 0);
    batch.draw(sttb, 0, 680);
    world.render(delta);
    batch.end();
}