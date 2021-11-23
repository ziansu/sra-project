@java.lang.Override
public void touchUp(com.badlogic.gdx.scenes.scene2d.InputEvent event, float x, float y, int pointer, int button) {
    back.setBounds(((back.getX()) - 5), back.getY(), ((back.getWidth()) + 5), ((back.getHeight()) + 5));
    game.mainMenuScreen = new by.randomen.screens.MainMenuScreen(game);
    game.setScreen(game.mainMenuScreen);
    game.settingsMScreen.dispose();
}