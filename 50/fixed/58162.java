@java.lang.Override
public void clicked(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y) {
    if (game.CONNECTED) {
        onlineStatusLabel.clear();
        game.setScreen(signUpScreen);
    }
}