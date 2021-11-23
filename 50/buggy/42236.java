@java.lang.Override
public void onPause() {
    android.util.Log.d(be.ugent.zeus.hydra.service.urgent.SimpleSessionCallback.TAG, "pause");
    if (mediaManager.isStateOneOf(MediaState.STARTED, MediaState.PAUSED, MediaState.PLAYBACK_COMPLETED)) {
        mediaManager.pause();
    }
}