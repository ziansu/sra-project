public static java.lang.String uiLanguage() {
    java.lang.String deviceLocale = java.util.Locale.getDefault().getLanguage();
    com.watabou.pixeldungeon.utils.GLog.i("Device locale: %s", deviceLocale);
    return Preferences.INSTANCE.getString(Preferences.KEY_LOCALE, deviceLocale);
}