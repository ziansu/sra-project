@java.lang.Override
public void start() throws java.lang.IllegalStateException {
    try {
        if ((mCurrentState) == (STATE_SEEKING)) {
            return ;
        }
        if (isInPlaybackState()) {
            if (isFileCompleted) {
                mMediaPlayer.seekTo(0);
                isFileCompleted = false;
                return ;
            }
            if ((mCurrentState) == (STATE_PAUSED)) {
                mMediaPlayer.resume();
            }else {
                mMediaPlayer.start();
            }
            mCurrentState = STATE_PLAYING;
        }
        mTargetState = STATE_PLAYING;
    } catch (java.lang.Exception e) {
    }
}