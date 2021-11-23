public void reflectSettings() {
    android.content.Context context = getApplicationContext();
    if (context != null) {
        setFontSize(com.app.strkita.measurenote.SettingPrefUtil.getFontSize(context));
        switchTheme(com.app.strkita.measurenote.SettingPrefUtil.isScreenReverse(context));
    }
}