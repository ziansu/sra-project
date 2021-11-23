@java.lang.Override
public void onPlay() {
    super.onPlay();
    android.util.Log.d(com.vpaliy.melophile.playback.PlaybackManager.TAG, "onPlay");
    handlePlayRequest(queueManager.current());
}