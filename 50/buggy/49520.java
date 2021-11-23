private synchronized void actionPause() {
    pauseActiveElements();
    mState = com.android.mms.dom.smil.SmilPlayer.SmilPlayerState.PAUSED;
    mAction = com.android.mms.dom.smil.SmilPlayer.SmilPlayerAction.NO_ACTIVE_ACTION;
    notifyPlayStateChangeListener();
}