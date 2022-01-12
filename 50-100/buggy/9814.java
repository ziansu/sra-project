@java.lang.Override
public boolean onAreaTouched(org.andengine.input.touch.TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
    if (pSceneTouchEvent.isActionDown()) {
        if (isVisible()) {
            setCurrentTileIndex(1);
        }
    }
    if (pSceneTouchEvent.isActionUp()) {
        if (isVisible()) {
            setCurrentTileIndex(0);
            setPause(true);
        }
    }
    return true;
}