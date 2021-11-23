@java.lang.Override
protected void onPause() {
    super.onPause();
    if ((textToSpeech) != null) {
        textToSpeech.stop();
        textToSpeech.shutdown();
    }
    finish();
}