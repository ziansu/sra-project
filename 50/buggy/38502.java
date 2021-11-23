public void speak(java.lang.String toSpeak) {
    android.widget.Toast.makeText(getApplicationContext(), toSpeak, Toast.LENGTH_SHORT).show();
    t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, params);
}