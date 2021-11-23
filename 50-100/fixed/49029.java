public void onPrepared(android.media.MediaPlayer mp) {
    if ((nextMediaPlayer) != mp) {
        return ;
    }
    try {
        setNextPlayerState(github.daneren2005.dsub.domain.PlayerState.PREPARED);
        if (((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) && (((playerState) == (github.daneren2005.dsub.domain.PlayerState.STARTED)) || ((playerState) == (github.daneren2005.dsub.domain.PlayerState.PAUSED)))) {
            mediaPlayer.setNextMediaPlayer(nextMediaPlayer);
            nextSetup = true;
        }
        applyReplayGain(nextMediaPlayer, downloadFile);
    } catch (java.lang.Exception x) {
        handleErrorNext(x);
    }
}