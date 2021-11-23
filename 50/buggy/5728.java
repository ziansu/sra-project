@java.lang.Override
public void onPlaybackError(java.lang.Error error) {
    android.util.Log.e(agency.tango.skald.spotify.player.callbacks.SpotifyNotificationCallback.TAG, java.lang.String.format("PlaybackError occurred %s", error.toString()));
    for (agency.tango.skald.core.listeners.OnPlaybackListener onPlaybackListener : onPlaybackListeners) {
        onPlaybackListener.onError(new agency.tango.skald.core.errors.PlaybackError());
    }
}