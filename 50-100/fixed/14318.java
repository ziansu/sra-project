@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    if ((mOnPlayingListener) != null) {
        mOnPlayingListener.onPlaying(mMusicInfo, totalAudioLength, totalAudioLength);
    }
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
    }
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_STOP;
    if ((mOnPlayingListener) != null) {
        mOnPlayingListener.onPlayStateChanged(PLAY_STATE);
        mOnPlayingListener.onCompletion();
    }
}