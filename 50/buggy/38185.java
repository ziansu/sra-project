@java.lang.Override
public void handleInput() {
    if (Gdx.input.justTouched()) {
        gsm.set(new com.naren.game.states.PlayState(gsm));
        dispose();
    }
}