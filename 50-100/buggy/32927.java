@java.lang.Override
public void dispose() {
    super.dispose();
    if ((com.yuyointeractive.utils.MyGame.commonAssets) != null) {
        com.yuyointeractive.utils.MyGame.commonAssets.dispose();
    }
    com.yuyointeractive.utils.MyGame.assetManager.dispose();
    com.yuyointeractive.utils.MyGame.loadingScreen = null;
    for (com.yuyointeractive.utils.MyScreen screen : com.yuyointeractive.utils.MyGame.screens.values()) {
        screen.dispose();
    }
    com.yuyointeractive.utils.MyGame.screens.clear();
    if ((com.yuyointeractive.utils.MyGame.shapeRenderer) != null) {
        com.yuyointeractive.utils.MyGame.shapeRenderer.dispose();
    }
    Gdx.app.exit();
}