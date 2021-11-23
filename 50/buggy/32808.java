@java.lang.Override
public void dispose() {
    sound.stop();
    Gdx.input.setInputProcessor(null);
    com.icyvenom.needforghetto.gamestate.GameState.GODMODE = false;
}