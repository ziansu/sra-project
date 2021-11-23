private void stopTextToSpeech() {
    if (!(isTTSEnabled())) {
        ttsSynthesizer.stopTextToSpeech();
    }
}