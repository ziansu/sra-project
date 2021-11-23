private void playSFX(int sound) {
    android.media.MediaPlayer mp = android.media.MediaPlayer.create(this, sound);
    mp.start();
}