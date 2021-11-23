protected void mediaOnPause() {
    pausedTime = mediaPlayer.getCurrentPosition();
    mediaPlayer.pause();
}