public static void setTheme(int theme) {
    switch (theme) {
        case R.style.AppLightTheme :
            cw.kop.autobackground.settings.AppSettings.prefs.edit().putString("application_theme", cw.kop.autobackground.settings.AppSettings.APP_LIGHT_THEME).commit();
            break;
        case R.style.AppDarkTheme :
            cw.kop.autobackground.settings.AppSettings.prefs.edit().putString("application_theme", cw.kop.autobackground.settings.AppSettings.APP_DARK_THEME).commit();
            break;
        case R.style.AppTransparentTheme :
            cw.kop.autobackground.settings.AppSettings.prefs.edit().putString("application_theme", cw.kop.autobackground.settings.AppSettings.APP_TRANSPARENT_THEME).commit();
            break;
        default :
            break;
    }
}