@java.lang.Override
public void onPrepared(android.media.MediaPlayer mediaPlayer) {
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_PAUSE;
    totalAudioLength = mediaPlayer.getDuration();
    if ((mOnPlayingListener) != null) {
        mOnPlayingListener.onPlaying(mMusicInfo, 0, totalAudioLength);
        mOnPlayingListener.onPlayStateChanged(mMusicInfo, PLAY_STATE);
        mOnPlayingListener.onPrepared(mMusicInfo);
    }
}