@java.lang.Override
public void onPrepared(@android.support.annotation.NonNull
com.devbrackets.android.playlistcore.api.MediaPlayerApi mediaPlayerApi) {
    retryCount = 0;
    startMediaPlayer();
    if (immediatelyPause) {
        immediatelyPause = false;
        if (mediaPlayerApi.isPlaying()) {
            performPause();
        }
    }
    if ((seekToPosition) > 0) {
        performSeek(seekToPosition, false);
        seekToPosition = -1;
    }
}