private void releasePlayer() {
    exoPlayer.release();
    exoPlayer.removeListener(this);
    exoPlayer = null;
}