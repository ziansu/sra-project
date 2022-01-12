protected void onPause() {
    super.onPause();
    mediaPlayer.stop();
    releaseMediaPlayer(mediaPlayer);
}