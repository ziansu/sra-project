private void speech() {
    engine.setPitch(((float) (pitch)));
    engine.setSpeechRate(((float) (speed)));
    engine.speak("Do you Need help?", TextToSpeech.QUEUE_FLUSH, null);
}