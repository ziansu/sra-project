@java.lang.Override
public void onRelease() {
    if ((mDbHandler) != null) {
        mDbHandler.removeCallbacks(mPlayCurrentProgramRunnable);
    }
    releasePlayer();
    mSessions.remove(this);
}