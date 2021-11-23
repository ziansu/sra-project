@java.lang.Override
public void dispose() {
    Gdx.app.debug(com.lothbrok.game.screens.AbstractScreen.TAG, "dispose");
    spriteBatch.dispose();
    shapeRenderer.dispose();
}