private synchronized void actionStop() {
    endActiveElements();
    mCurrentTime = 0;
    mCurrentElement = 0;
    mCurrentSlide = 0;
    mState = com.android.mms.dom.smil.SmilPlayer.SmilPlayerState.STOPPED;
    mAction = com.android.mms.dom.smil.SmilPlayer.SmilPlayerAction.NO_ACTIVE_ACTION;
}