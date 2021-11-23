@java.lang.Override
public void dispose() {
    Assets.music.stop();
    mapRenderer.dispose();
    spriteBatch.dispose();
    spriteBatch.dispose();
}