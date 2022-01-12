@java.lang.Override
public void release() {
    if ((mMediaPlayer) != null) {
        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.stop();
        }
        mMediaPlayer.release();
        mMediaPlayer = null;
    }
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_RELEASE;
    mOnPlayingListener.onPlayStateChanged(mMusicInfo, PLAY_STATE);
}