@java.lang.Override
public void onClick(android.view.View view) {
    if (((txt_speech) != null) && (!(txt_speech.isSpeaking()))) {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
            txt_speech.speak(wordsEN[wordsIndex], TextToSpeech.QUEUE_FLUSH, null, null);
        }else {
            txt_speech.speak(wordsEN[wordsIndex], TextToSpeech.QUEUE_FLUSH, null);
        }
    }
}