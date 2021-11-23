public static void returnToDefaultTheme(android.content.Context context) {
    Settings.Secure.putInt(context.getContentResolver(), Settings.Secure.THEME_PRIMARY_COLOR, 1);
    Settings.Secure.putInt(context.getContentResolver(), Settings.Secure.THEME_ACCENT_COLOR, 0);
}