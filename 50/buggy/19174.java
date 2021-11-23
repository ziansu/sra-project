public static boolean getAllowAdvancedData(android.content.SharedPreferences settings) {
    boolean mDefault = false;
    if (com.paulvarry.intra42.Tools.AppSettings.Advanced.getAllowAdvanced(settings))
        return settings.getBoolean(com.paulvarry.intra42.Tools.AppSettings.Advanced.PREFERENCE_ADVANCED_ALLOW_DATA, false);
    else
        return false;
    
}