public static int getDialogColor(android.content.Context context) {
    switch (cw.kop.autobackground.settings.AppSettings.getTheme()) {
        default :
        case cw.kop.autobackground.settings.AppSettings.APP_LIGHT_THEME :
            return context.getResources().getColor(R.color.LIGHT_THEME_DIALOG);
        case cw.kop.autobackground.settings.AppSettings.APP_DARK_THEME :
            return context.getResources().getColor(R.color.DARK_THEME_DIALOG);
    }
}