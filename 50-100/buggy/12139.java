public void onInit(int initStatus) {
    if (initStatus == (android.speech.tts.TextToSpeech.SUCCESS)) {
        if ((tts.isLanguageAvailable(java.util.Locale.US)) == (android.speech.tts.TextToSpeech.LANG_AVAILABLE)) {
            tts.setLanguage(java.util.Locale.US);
        }
    }else
        if (initStatus == (android.speech.tts.TextToSpeech.ERROR)) {
            android.widget.Toast.makeText(activity, "Sorry! Text to Speech failed...", Toast.LENGTH_LONG).show();
        }
    
}