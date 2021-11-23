@java.lang.Override
public boolean touchDown(int screenX, int screenY, int pointer, int button) {
    boolean result = super.touchDown(screenX, screenY, pointer, button);
    if ((gridHitbox.isGridShow()) && (gridHitbox.isInsideHitbox(touched.x, touched.y))) {
        gridHitbox.showTileWhereClicked(touched.x, touched.y);
    }
    return result;
}