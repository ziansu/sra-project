@java.lang.Override
public void onPause() {
    if (mediaManager.isStateOneOf(MediaState.STARTED, MediaState.PAUSED, MediaState.PLAYBACK_COMPLETED)) {
        mediaManager.pause();
    }
}