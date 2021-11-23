public void releasePlayer() {
    if ((mExoPlayer) != null) {
        mExoPlayer.stop();
        mExoPlayer.release();
        mExoPlayer = null;
    }
}