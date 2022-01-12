private void notifyChange(int pSelectedPoint, int pX, double pY) {
    org.jwildfire.create.tina.base.Flame flame = owner.getOwner().getCurrFlame();
    if (owner.isUseUndoManager()) {
        owner.getOwner().undoManager.saveUndoPoint(flame);
    }
    org.jwildfire.create.tina.base.motion.MotionCurve curve = getCurve(flame);
    curve.assignFromEnvelope(ctrl.getCurrEnvelope());
    owner.getOwner().refreshFlameImage(true, false, 1, true, false);
}