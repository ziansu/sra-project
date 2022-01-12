public void restartSpeech() {
    speakerOut.speak("Parada", TextToSpeech.QUEUE_ADD, null);
    sr.startListening(android.speech.RecognizerIntent.getVoiceDetailsIntent(getApplicationContext()));
}