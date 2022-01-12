@java.lang.Override
public void onStateChanged(boolean playWhenReady, int playbackState) {
    if (playbackState == (com.google.android.exoplayer.ExoPlayer.STATE_ENDED)) {
        muxNotifier.onMediaPlaybackEnded();
        if (!(notifiedCompleted)) {
            notifyCompletionListener();
        }
    }else
        if ((playbackState == (com.google.android.exoplayer.ExoPlayer.STATE_READY)) && (!(notifiedPrepared))) {
            notifyPreparedListener();
        }
    
    if ((playbackState == (com.google.android.exoplayer.ExoPlayer.STATE_READY)) && playWhenReady) {
        muxNotifier.onPreviewImageStateChanged(false);
    }
}