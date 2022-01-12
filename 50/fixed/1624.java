public static boolean showAdvancedPreferences(android.content.Context context) {
    return (android.provider.Settings.Secure.getInt(context.getContentResolver(), android.provider.Settings.Secure.ADVANCED_MODE, 1)) == 1;
}