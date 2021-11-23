@java.lang.Override
public void render(float delta) {
    if (Gdx.input.justTouched()) {
        game.setScreen(new com.mygdx.magicappgame.States.PlayScreen(((com.mygdx.magicappgame.MyGdxGame) (game))));
        dispose();
    }
    Gdx.gl.glClearColor(0, 0, 0, 1);
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    stage.draw();
}