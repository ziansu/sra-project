public synchronized void play() {
    if (!(isPlayingState())) {
        mCurrentTime = 0;
        mCurrentElement = 0;
        mCurrentSlide = 0;
        mPlayerThread = new java.lang.Thread(this);
        mState = com.android.mms.dom.smil.SmilPlayer.SmilPlayerState.PLAYING;
        mPlayerThread.start();
    }else {
        android.util.Log.w(com.android.mms.dom.smil.SmilPlayer.TAG, "Error State: Playback is playing!");
    }
}