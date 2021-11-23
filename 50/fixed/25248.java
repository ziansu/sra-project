@java.lang.Override
public void render(float delta) {
    accum += delta;
    accum -= com.gdx.game.GdxGame.STEP;
    gsm.update(GdxGame.STEP);
    gsm.render();
    com.gdx.Handlers.MyInput.update();
}