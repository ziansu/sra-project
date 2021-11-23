@java.lang.Override
public void stop() {
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
    }
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_STOP;
    mOnPlayingListener.onPlayStateChanged(mMusicInfo, PLAY_STATE);
    mOnPlayingListener.onPlaying(mMusicInfo, 0, totalAudioLength);
}