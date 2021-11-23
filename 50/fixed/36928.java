@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    android.util.Log.e(com.hardikarora.spotify_1.service.SpotifyPlayerService.LOG_TAG, "Error occured with the media player.");
    mp.reset();
    return true;
}