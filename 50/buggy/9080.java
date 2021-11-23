public void start() {
    if ((exoPlayer) != null) {
        exoPlayer.setPlayWhenReady(true);
    }else {
        mediaPlayer.start();
    }
}