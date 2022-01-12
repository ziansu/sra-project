@java.lang.Override
public boolean onAreaTouched(org.andengine.input.touch.TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
    if (pSceneTouchEvent.isActionDown()) {
        setCurrentTileIndex(1);
    }
    if (pSceneTouchEvent.isActionUp()) {
        setCurrentTileIndex(0);
        setPause(false);
    }
    return true;
}