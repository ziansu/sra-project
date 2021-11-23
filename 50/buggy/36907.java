public void stopPlayback() {
    if (!(useExo)) {
        mediaPlayer.stop();
    }else {
        emExoPlayer.setPlayWhenReady(false);
    }
    stopProgressPoll();
}