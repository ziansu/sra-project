private synchronized void waitForWakeUp() {
    try {
        while (!(((((isStartAction()) || (isStopAction())) || (isReloadAction())) || (isNextAction())) || (isPrevAction()))) {
            wait(com.android.mms.dom.smil.SmilPlayer.TIMESLICE);
        } 
        if (isStartAction()) {
            mAction = com.android.mms.dom.smil.SmilPlayer.SmilPlayerAction.NO_ACTIVE_ACTION;
            mState = com.android.mms.dom.smil.SmilPlayer.SmilPlayerState.PLAYING;
        }
    } catch (java.lang.InterruptedException e) {
        android.util.Log.e(com.android.mms.dom.smil.SmilPlayer.TAG, "Unexpected InterruptedException.", e);
    }
}