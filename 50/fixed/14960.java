public void reset() {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "reset");
    releaseObjects();
    initObjects();
}