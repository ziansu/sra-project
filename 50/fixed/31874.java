private void playMusic() {
    mediaPlayer.start();
    buttonPlayPause.setImageResource(R.drawable.button_pause);
    startTime = java.lang.System.currentTimeMillis();
}