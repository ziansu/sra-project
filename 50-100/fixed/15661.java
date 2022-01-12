public final boolean isHiddenViewInteractionPossible() {
    if ((((currentSwipeableHiddenView) != null) && (currentSwipeableHiddenView.isHiddenViewSetupSet())) && (!(currentSwipeableHiddenView.isHiddenViewCovered()))) {
        boolean started = currentSwipeableHiddenView.mStarted;
        float offset = java.lang.Math.abs(currentSwipeableHiddenView.mOffset);
        float iOffset = currentSwipeableHiddenView.mData.interruptOffset;
        return (!started) || (started && (offset >= iOffset));
    }
    return false;
}