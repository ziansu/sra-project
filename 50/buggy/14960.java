public void reset() {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "reset");
    if ((mediaPlayer) != null) {
        this.currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.IDLE;
        releaseObjects();
        initObjects();
    }else
        throw new java.lang.RuntimeException("Media Player is not initialized");
    
}