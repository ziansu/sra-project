@java.lang.Override
public void show() {
    super.show();
    Gdx.app.debug(com.lothbrok.game.screens.MainMenuScreen.TAG, "show");
    stage = new com.badlogic.gdx.scenes.scene2d.Stage(new com.badlogic.gdx.utils.viewport.ExtendViewport(Resolution.instance.getMenuWidth(), Resolution.instance.getMenuHeight()));
    skin = assets.getMainMenuSkin();
    colorSky = skin.getColor(MainMenuConstants.MAIN_MENU_COLOR_SKY);
    Gdx.input.setInputProcessor(stage);
    rebuildStage();
    audio = new com.lothbrok.game.audio.Audio(assets.getMusicAssets(), assets.getSoundAssets());
    audio.playMenuMusic();
}