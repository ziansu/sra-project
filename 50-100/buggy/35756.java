private void pause() {
    if (!(mIsPlaying)) {
        return ;
    }
    if ((mPlayer) != null) {
        mPlayer.pause();
        mIsPlaying = false;
    }
    releaseSeekBarTimer();
    uiUpdatePlayButton();
    startForeground(mStartId, getForegroundNotification());
}