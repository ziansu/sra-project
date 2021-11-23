public void enable() {
    android.util.Log.d("NavigationOracle", "Enabling");
    java.util.Locale locale = com.spoiledmilk.ibikecph.IBikeApplication.getLocale();
    if ((tts.isLanguageAvailable(locale)) == (android.speech.tts.TextToSpeech.LANG_AVAILABLE)) {
        tts.setLanguage(locale);
        enabled = true;
        if ((route) != null) {
            routeReady();
        }
        emitEnabled();
    }else {
        android.util.Log.e("NavigationOracle", "Language was not supported");
        emitUnsupportedLanguage();
        disable();
    }
}