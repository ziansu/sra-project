private void stopTextToSpeechSDK() {
    if (((mediaPlayer) != null) && (mediaPlayer.isPlaying())) {
        mediaPlayer.stop();
        mediaPlayer.reset();
    }
}