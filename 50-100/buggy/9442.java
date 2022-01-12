public static final java.lang.String getLang(omnikryptec.lang.Language language, java.lang.String key, java.lang.String defaultValue) {
    if (language == null) {
        return null;
    }
    if (omnikryptec.lang.LanguageManager.isCollecting) {
        omnikryptec.lang.LanguageManager.languageDefault.put(key, defaultValue);
    }
    return language.getProperty(key, defaultValue);
}