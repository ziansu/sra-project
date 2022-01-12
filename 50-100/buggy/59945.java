public static boolean setLanguage(java.lang.String localeCode) {
    boolean languageChanged = false;
    android.content.res.Configuration config = com.ichi2.anki.AnkiDroidApp.getInstance().getResources().getConfiguration();
    java.util.Locale newLocale = com.ichi2.utils.LanguageUtil.getLocale(localeCode);
    if (!(config.locale.equals(newLocale))) {
        languageChanged = true;
        config.locale = newLocale;
        com.ichi2.anki.AnkiDroidApp.getInstance().getResources().updateConfiguration(config, com.ichi2.anki.AnkiDroidApp.getInstance().getResources().getDisplayMetrics());
    }
    return languageChanged;
}