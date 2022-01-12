private void stopTextToSpeechSDK() {
    if ((mediaPlayer) != null) {
        mediaPlayer.stop();
        mediaPlayer.reset();
    }
}