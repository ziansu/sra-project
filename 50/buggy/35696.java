@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    gameManager.setState(new com.zolotukhin.picturegame.state.gamestate.GameState(gameManager));
    gameManager.putParcel(GameState.PARAM_PAINTER, finalPainter);
}