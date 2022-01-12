private synchronized void handlePause() {
    if (((mPlayer) != null) && (mPlayer.isPlaying())) {
        mPlayer.pause();
    }
}