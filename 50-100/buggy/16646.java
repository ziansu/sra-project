public void start() throws java.lang.IllegalStateException {
    android.util.Log.d(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "start");
    if ((mediaPlayer) != null) {
        currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.STARTED;
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
            @java.lang.Override
            public void onCompletion(android.media.MediaPlayer mp) {
                android.util.Log.i(com.github.rtoshiro.view.video.FullscreenVideoView.TAG, "onCompletion");
            }
        });
    }else
        throw new java.lang.RuntimeException("Media Player is not initialized");
    
}