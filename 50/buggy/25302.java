private void cleanUp() {
    if ((mMediaPlayer) != null) {
        mMediaPlayer.release();
        mMediaPlayer = null;
        stopForeground(true);
    }
}