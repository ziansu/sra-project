private void playNoise() {
    if (((mediaPlayer) != null) && (mediaPlayer.isPlaying())) {
        stopAndResetPlayer();
    }
    mediaPlayer = android.media.MediaPlayer.create(this, currentThing.getNoise());
    mediaPlayer.start();
    mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
        public void onCompletion(android.media.MediaPlayer player) {
            player.reset();
            playSound();
        }
    });
}