private void initPlayer() {
    if ((mMediaPlayer) == null) {
        mMediaPlayer = new android.media.MediaPlayer();
        mMediaPlayer.setOnPreparedListener(this);
        mMediaPlayer.setOnCompletionListener(this);
        mMediaPlayer.setOnErrorListener(this);
        mMediaPlayer.setOnSeekCompleteListener(this);
    }else {
        mMediaPlayer.reset();
    }
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_STOP;
    mOnPlayingListener.onPlayStateChanged(PLAY_STATE);
}