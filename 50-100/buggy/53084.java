@java.lang.Override
public void pause() {
    android.util.Log.d(com.scooter1556.sms.android.activity.VideoPlaybackActivity.TAG, "pause()");
    if ((playbackState) == (android.support.v4.media.session.PlaybackStateCompat.STATE_PLAYING)) {
        if (((mediaPlayer) != null) && (mediaPlayer.getPlayWhenReady())) {
            mediaPlayer.setPlayWhenReady(false);
            currentPosition = mediaPlayer.getCurrentPosition();
        }
        relaxResources(false);
    }
    playbackState = android.support.v4.media.session.PlaybackStateCompat.STATE_PAUSED;
    if ((callback) != null) {
        callback.onPlaybackStatusChanged(playbackState);
    }
}