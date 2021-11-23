@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(0.5F, 0.5F, 0.5F, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    if (!(text.equals("")))
        log.appendText(((text) + "\n"));
    
    text = "";
    stage.act();
    stage.draw();
}