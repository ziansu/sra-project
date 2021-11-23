private void pause() {
    if (!(mIsPlaying)) {
        return ;
    }
    releaseSeekBarTimer();
    uiUpdatePlayButton();
    startForeground(mStartId, getForegroundNotification());
    if ((mPlayer) != null) {
        mPlayer.pause();
        mIsPlaying = false;
    }
}