@java.lang.Override
public void render(float delta) {
    Gdx.gl.glClearColor(1, 1, 1, 1);
    Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
    stage.act(delta);
    stage.draw();
    if (com.mygdx.game.gamestart.util.BlastUtil.update()) {
    }
    if (isOpenSelectStage) {
        selectPlayerStage.act();
        selectPlayerStage.draw();
    }
}