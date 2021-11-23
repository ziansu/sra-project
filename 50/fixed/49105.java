protected void mediaOnPause() {
    if ((mediaPlayer) != null) {
        pausedTime = mediaPlayer.getCurrentPosition();
        mediaPlayer.pause();
    }
}