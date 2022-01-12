@java.lang.Override
public boolean touchDragged(int screenX, int screenY, int pointer) {
    boolean result = super.touchDragged(screenX, screenY, pointer);
    Gdx.app.log("deb", touched.toString());
    if (gridHitbox.isGridShow()) {
        gridHitbox.showTileWhereMoved(touched.x, touched.y);
    }
    return result;
}