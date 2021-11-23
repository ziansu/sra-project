@java.lang.Override
public void onPlaybackError(java.lang.Error error) {
    for (agency.tango.skald.core.listeners.OnPlaybackListener onPlaybackListener : onPlaybackListeners) {
        onPlaybackListener.onError(new agency.tango.skald.core.errors.PlaybackError(error.toString()));
    }
}