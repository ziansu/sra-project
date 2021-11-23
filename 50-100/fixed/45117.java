@java.lang.Override
public void render(float delta) {
    super.render(delta);
    if (timer.isRunning()) {
        game.getState().addTime(delta);
    }
    if ((Gdx.input.isKeyJustPressed(Input.Keys.BACK)) || (Gdx.input.isKeyJustPressed(Input.Keys.ESCAPE))) {
        if ((!(paused)) && (!(timeout))) {
            pause();
        }
    }
}