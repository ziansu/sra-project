@java.lang.Override
public void onPrepared(@android.support.annotation.NonNull
com.devbrackets.android.playlistcore.api.MediaPlayerApi mediaPlayerApi) {
    retryCount = 0;
    setPlaybackState(com.devbrackets.android.playlistcore.service.PlaylistServiceCore.PlaybackState.PLAYING);
    startMediaPlayer();
    if (immediatelyPause) {
        immediatelyPause = false;
        if (mediaPlayerApi.isPlaying()) {
            performPause();
        }
    }
    if ((seekToPosition) > 0) {
        performSeek(seekToPosition);
        seekToPosition = -1;
    }
    updateRemoteViews();
    updateNotification();
}