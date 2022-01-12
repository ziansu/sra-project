public void onVideoPlayPause() {
    if (org.schabi.newpipe.player.BasePlayer.DEBUG)
        android.util.Log.d(org.schabi.newpipe.player.BasePlayer.TAG, "onVideoPlayPause() called");
    
    if ((currentState) == (org.schabi.newpipe.player.BasePlayer.STATE_COMPLETED)) {
        onVideoPlayPauseRepeat();
        return ;
    }
    if (!(isPlaying()))
        audioManager.requestAudioFocus(this, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN);
    else
        audioManager.abandonAudioFocus(null);
    
    simpleExoPlayer.setPlayWhenReady((!(isPlaying())));
}