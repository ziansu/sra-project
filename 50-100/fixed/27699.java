@java.lang.Override
public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {
    com.facebook.react.bridge.WritableMap params = com.facebook.react.bridge.Arguments.createMap();
    params.putBoolean("playWhenReady", playWhenReady);
    params.putInt("playbackState", playbackState);
    sendEvent("onPlayerStateChanged", params);
    if (playbackState == (com.google.android.exoplayer.ExoPlayer.STATE_ENDED)) {
        resetToBeginning();
        if ((handle) != null) {
            handle.invalidate();
        }
        reportPlayerPosition();
    }
}