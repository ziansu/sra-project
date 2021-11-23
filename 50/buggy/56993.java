@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    returnIndex = Game.viewIndexes.HOME;
    update();
    com.mygdx.game.Controller.callViewSwitch();
}