public void stopBackgroundMusic() {
    bgMediaPlayer.stop();
    bgMediaPlayer.release();
    bgMediaPlayer = null;
}