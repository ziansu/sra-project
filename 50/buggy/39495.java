public void speakToUser(java.lang.String words) {
    boolean end = false;
    while (!end)
        if (!(t1.isSpeaking()))
            t1.speak(words, TextToSpeech.QUEUE_FLUSH, null);
        else
            end = true;
        
    
}