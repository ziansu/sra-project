public void tts(java.lang.String text) {
    if (((myHashAlarm) != null) && (TTSDEBUG)) {
        myHashAlarm.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, text);
        mTts.speak(text, TextToSpeech.QUEUE_FLUSH, myHashAlarm);
    }
}