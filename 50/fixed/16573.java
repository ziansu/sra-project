private void releasePlayer() {
    if ((mNotificationManager) != null) {
        mNotificationManager.cancelAll();
    }
    if ((mExoPlayer) != null) {
        mExoPlayer.stop();
        mExoPlayer.release();
        mExoPlayer = null;
    }
}