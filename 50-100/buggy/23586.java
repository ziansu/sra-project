@java.lang.Override
public void create() {
    no.tobkje.aagame.AAGame.GAME_WIDTH = 520;
    no.tobkje.aagame.AAGame.SCREEN_WIDTH = Gdx.graphics.getWidth();
    no.tobkje.aagame.AAGame.SCREEN_HEIGHT = Gdx.graphics.getHeight();
    no.tobkje.aagame.AAGame.GAME_HEIGHT = (no.tobkje.aagame.AAGame.SCREEN_HEIGHT) / ((no.tobkje.aagame.AAGame.SCREEN_WIDTH) / (no.tobkje.aagame.AAGame.GAME_WIDTH));
    no.tobkje.aagame.settings.Settings.put("debug", false);
    setScreen(new no.tobkje.aagame.screens.SplashScreen(this));
}