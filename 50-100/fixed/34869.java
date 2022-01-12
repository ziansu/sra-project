@java.lang.Override
public void onError(int error) {
    android.util.Log.d("onerror", ("error = " + error));
    if (error == (android.speech.SpeechRecognizer.ERROR_CLIENT)) {
        stopSelf();
    }
    if ((error == (android.speech.SpeechRecognizer.ERROR_SPEECH_TIMEOUT)) || (error == (android.speech.SpeechRecognizer.ERROR_NO_MATCH))) {
        restartListening();
    }
}