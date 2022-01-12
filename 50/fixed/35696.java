@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    gameManager.putParcel(GameState.PARAM_PAINTER, finalPainter);
    gameManager.setState(new com.zolotukhin.picturegame.state.gamestate.GameState(gameManager));
}