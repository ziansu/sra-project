protected void prepare() throws java.lang.IllegalStateException {
    startLoading();
    this.videoIsReady = false;
    this.initialMovieHeight = -1;
    this.initialMovieWidth = -1;
    this.mediaPlayer.setOnPreparedListener(this);
    this.mediaPlayer.setOnErrorListener(this);
    this.mediaPlayer.setOnSeekCompleteListener(this);
    this.mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
    this.currentState = com.github.rtoshiro.view.video.FullscreenVideoView.State.PREPARING;
    this.mediaPlayer.prepareAsync();
}