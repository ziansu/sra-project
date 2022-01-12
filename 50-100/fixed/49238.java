public void resetBtn_clicked() {
    org.jwildfire.create.tina.base.Flame flame = owner.getCurrFlame();
    if (useUndoManager) {
        owner.undoManager.saveUndoPoint(flame);
    }
    flame.resetMixerCurves();
    refreshValues(false);
    owner.refreshFlameImage(true, false, 1, true, false);
}