public void speak(java.lang.String text) {
    if ((ready) && (allowed)) {
        java.util.HashMap<java.lang.String, java.lang.String> hash = new java.util.HashMap<java.lang.String, java.lang.String>();
        hash.put(TextToSpeech.Engine.KEY_PARAM_STREAM, java.lang.String.valueOf(AudioManager.STREAM_NOTIFICATION));
        tts.speak(text, TextToSpeech.QUEUE_ADD, hash);
    }
}