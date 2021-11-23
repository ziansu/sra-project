@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    com.tutorial.game.screens.LocalGameScreen localGameScreen = new com.tutorial.game.screens.LocalGameScreen();
    ((com.badlogic.gdx.Game) (Gdx.app.getApplicationListener())).setScreen(localGameScreen);
    dispose();
}