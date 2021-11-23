@java.lang.Override
public void onCompletion(android.media.MediaPlayer mediaPlayer) {
    mWaveformView.setIsBookmarking(false);
    mPlayer.stop();
    togglePlayButton();
    resetSelection();
    return ;
}