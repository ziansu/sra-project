@java.lang.Override
public boolean onAreaTouched(org.andengine.input.touch.TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
    if (pSceneTouchEvent.isActionDown()) {
        if (!(mSharingVisible)) {
            setCurrentTileIndex(1);
        }
    }
    if (pSceneTouchEvent.isActionUp()) {
        if (!(mSharingVisible)) {
            setCurrentTileIndex(0);
            mActivity.openRate();
        }
    }
    return true;
}