@java.lang.Override
public void onInit(int initStatus) {
    if (initStatus == (android.speech.tts.TextToSpeech.SUCCESS)) {
        tts.setLanguage(java.util.Locale.US);
    }else
        if (initStatus == (android.speech.tts.TextToSpeech.ERROR)) {
            android.widget.Toast.makeText(activity, "Sorry! Text to Speech failed...", Toast.LENGTH_LONG).show();
        }
    
}