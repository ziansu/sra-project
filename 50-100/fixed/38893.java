@java.lang.Override
public void onAmbientModeChanged(boolean inAmbientMode) {
    super.onAmbientModeChanged(inAmbientMode);
    watchFace.setInAmbientMode(inAmbientMode);
    watchFace.setAntiAlias((!inAmbientMode));
    invalidate();
    if (!inAmbientMode) {
        java.lang.System.gc();
        mouthFrameCounter = 0;
    }
    startTimerIfNecessary();
}