@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    oreSellAmount += 5;
    if ((oreSellAmount) > (gameEngine.getCurrentPlayer().getOre())) {
        oreSellAmount = gameEngine.getCurrentPlayer().getOre();
    }
}