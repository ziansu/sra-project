public boolean onAreaTouched(org.andengine.input.touch.TouchEvent pSceneTouchEvent, float pTouchAreaLocalX, float pTouchAreaLocalY) {
    if (pSceneTouchEvent.isActionDown()) {
        setTouchAreaBindingOnActionDownEnabled(false);
        setTouchAreaBindingOnActionMoveEnabled(false);
        gameHud.dispose();
        gameHud.setVisible(false);
        detachChild(gameHud);
        myGarbageCollection();
        com.matedevs.protectthetown.manager.SceneManager.getInstance().loadGameScene(engine, this);
    }
    return true;
}