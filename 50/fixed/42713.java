private void stopPlayer() {
    mMediaPlayer.stop();
    mMediaPlayer.release();
    mMediaPlayer = null;
}