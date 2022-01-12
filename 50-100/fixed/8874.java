public int render() {
    Gdx.gl.glClearColor(0.2F, 0.2F, 0.2F, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    stage.act(java.lang.Math.min(Gdx.graphics.getDeltaTime(), (1 / 30.0F)));
    stage.draw();
    return num;
}