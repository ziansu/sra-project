@java.lang.Override
public boolean isIdleNow() {
    boolean isIdle = (event.getSyncStatus()) == (SyncEvent.SyncStatus.END);
    boolean wasIdle = mWasIdle.getAndSet(isIdle);
    if ((isIdle && (!wasIdle)) && ((mResourceCallback) != null)) {
        mResourceCallback.onTransitionToIdle();
        mResourceCallback = null;
    }
    return isIdle;
}