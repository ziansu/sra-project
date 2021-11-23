@java.lang.Override
public boolean touchDown(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    currentDialog.remove();
    gameScreen.setGameState(gameScreen.getPreviousGameState());
    return true;
}