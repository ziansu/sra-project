@java.lang.Override
public void create() {
    game = this;
    incanshift.world.GameSettings.MUSIC_VOLUME = 1;
    incanshift.world.GameSettings.SOUND_VOLUME = 1;
    startScreen = new incanshift.screen.StartScreen(game, reqWidth, reqHeight);
    setScreen(startScreen);
}