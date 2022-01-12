public void releasePlayer() {
    if ((mExoPlayer) == null) {
        return ;
    }
    mExoPlayer.stop();
    mExoPlayer.release();
    mExoPlayer = null;
}