public void start() throws java.lang.IllegalStateException {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "start");
    if ((mediaPlayer) != null) {
        currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.STARTED;
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(this);
    }else
        throw new java.lang.RuntimeException("Media Player is not initialized");
    
}