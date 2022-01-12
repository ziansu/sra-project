@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    batch.begin();
    warlock.draw(batch);
    batch.end();
    menuStage.act(delta);
    menuStage.draw();
    java.lang.System.out.println(i);
}