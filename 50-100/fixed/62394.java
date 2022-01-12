@java.lang.Override
public void create() {
    if (com.mygdx.game.MyGame.FULLSCREEN)
        Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
    
    assetsManager = new com.mygdx.game.core.AssetsManager();
    batch = new com.badlogic.gdx.graphics.g2d.PolygonSpriteBatch();
    player = new com.mygdx.game.actors.Player(this, true, 0);
    if (true) {
        assetsManager.prepare(AssetsManager.PREPARE.LOBBY);
        currentScreen = new com.mygdx.game.screens.lobby.PresentationScreen(this);
    }else {
        assetsManager.prepare(AssetsManager.PREPARE.LOBBY);
        currentScreen = new com.mygdx.game.screens.lobby.MainMenuScreen(this);
    }
    setScreenSECURE(currentScreen, true);
}