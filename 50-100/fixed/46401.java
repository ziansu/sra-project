public void setPausedModifier(final boolean paused) {
    mPaused = paused;
    mActiveStatePauseStatus = paused;
    if (!(mActiveStatePauseStatusInitialized)) {
        mActiveStatePauseStatus = mPaused;
        mActiveStatePauseStatusInitialized = true;
    }
    if (!(mMediaPlayerValid)) {
        return ;
    }
    if (mPaused) {
        if (mMediaPlayer.isPlaying()) {
            pause();
        }
    }else {
        if (!(mMediaPlayer.isPlaying())) {
            start();
            mProgressUpdateHandler.post(mProgressUpdateRunnable);
        }
    }
}