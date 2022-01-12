@java.lang.Override
public boolean onError(android.media.MediaPlayer mp, int what, int extra) {
    de.kordelle.radio.logging.LogHelper.d(de.kordelle.radio.service.MediaPlayerService.TAG, java.lang.String.format("What: %d, Extra: %d", what, extra));
    try {
        releaseWifiLock();
        mp.stop();
        mp.reset();
        state(de.kordelle.radio.service.MediaPlayerService.MediaPlayerState.STOPPED, java.lang.String.format("What: %d, Extra: %d", what, extra));
    } catch (java.lang.Exception ex) {
        de.kordelle.radio.logging.LogHelper.e(de.kordelle.radio.service.MediaPlayerService.TAG, "Error while handling media player error.", ex);
        state(de.kordelle.radio.service.MediaPlayerService.MediaPlayerState.ERROR, ex);
    }
    return true;
}