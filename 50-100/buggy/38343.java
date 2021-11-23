public java.util.Locale getLocale() {
    final java.lang.String localeLanguage = preferences.getLocaleLanguage();
    if ((localeLanguage == null) || (localeLanguage.isEmpty())) {
        if (com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.isTraceEnabled()) {
            com.googlecode.cchlib.apps.duplicatefiles.prefs.PreferencesControler.LOGGER.trace((("localeLanguage = (not defined) [" + localeLanguage) + ']'));
        }
        return null;
    }else {
        return new java.util.Locale(localeLanguage);
    }
}