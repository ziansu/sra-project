@java.lang.Override
public void run() {
    initVoices();
    initLock.release();
    if ((preInitSetVoice) != null)
        setVoice(preInitSetVoice);
    else
        if (useNativeVoice) {
            android.speech.tts.Voice voice = tts.getDefaultVoice();
            if (voice != null)
                tts.setVoice(voice);
            
        }else
            setVoice(new tk.mygod.speech.tts.SvoxPicoTtsEngine.LocaleVoice(((Build.VERSION.SDK_INT) >= 18 ? tts.getDefaultLanguage() : context.getResources().getConfiguration().locale)));
        
    
}