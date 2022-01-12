@java.lang.Override
public void onPrepared(android.media.MediaPlayer mp) {
    de.kordelle.radio.logging.LogHelper.i(de.kordelle.radio.service.MediaPlayerService.TAG, "start playing of media.");
    try {
        mediaPlayer.start();
        state(de.kordelle.radio.service.MediaPlayerService.MediaPlayerState.PLAYING, null);
    } catch (java.lang.Exception ex) {
        de.kordelle.radio.logging.LogHelper.e(de.kordelle.radio.service.MediaPlayerService.TAG, "Error starting playback", ex);
        state(de.kordelle.radio.service.MediaPlayerService.MediaPlayerState.ERROR, ex);
    }
}