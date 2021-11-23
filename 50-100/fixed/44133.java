@java.lang.Override
public void playNextAudio(com.nexusex.ted.bean.MusicInfo musicInfo) {
    if ((mMediaPlayer) != null) {
        mMediaPlayer.stop();
    }
    PLAY_STATE = com.nexusex.ted.playmusic.LetUsPlay.STATE_STOP;
    if ((mOnPlayingListener) != null) {
        mOnPlayingListener.onPlayStateChanged(PLAY_STATE);
    }
    prepare(musicInfo);
}