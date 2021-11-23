@java.lang.Override
public void onScreenTurnedOn() {
    mLockIcon.setScreenOn(true);
    mScreenOn = true;
    requestVisualizer(true, 300);
}