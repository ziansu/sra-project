public static void setLanguage(java.lang.String localeCode) {
    android.content.res.Configuration config = com.ichi2.anki.AnkiDroidApp.getInstance().getResources().getConfiguration();
    java.util.Locale newLocale = com.ichi2.utils.LanguageUtil.getLocale(localeCode);
    config.locale = newLocale;
    com.ichi2.anki.AnkiDroidApp.getInstance().getResources().updateConfiguration(config, com.ichi2.anki.AnkiDroidApp.getInstance().getResources().getDisplayMetrics());
}