@java.lang.SuppressWarnings(value = "deprecation")
private void setDefaultLanguage() {
    if (useNativeVoice)
        try {
            android.speech.tts.Voice voice = tts.getDefaultVoice();
            if (voice != null) {
                tts.setVoice(voice);
                setLanguage(voice.getLocale());
            }
            return ;
        } catch (java.lang.RuntimeException exc) {
            handleNativeVoiceException(exc);
        }
    
    setLanguage(((Build.VERSION.SDK_INT) >= 18 ? tts.getDefaultLanguage() : context.getResources().getConfiguration().locale));
}