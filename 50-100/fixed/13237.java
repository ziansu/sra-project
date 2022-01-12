@java.lang.Override
public void pause() {
    if ((mMediaPlayer) == null) {
        throw new java.lang.NullPointerException("the mediaPlayer is null!");
    }
    if (mMediaPlayer.isPlaying()) {
        mMediaPlayer.pause();
    }
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_PAUSE;
    mOnPlayingListener.onPlayStateChanged(PLAY_STATE);
}