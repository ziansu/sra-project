@java.lang.Override
public void onScreenTurnedOn() {
    mLockIcon.setScreenOn(true);
    mScreenOn = true;
    updateLockIcon();
    requestVisualizer(true, 300);
}