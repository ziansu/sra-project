public static int getDefaultCategory(android.content.Context context) {
    return org.wordpress.android.ui.prefs.SiteSettingsInterface.siteSettingsPreferences(context).getInt(org.wordpress.android.ui.prefs.SiteSettingsInterface.DEF_CATEGORY_PREF_KEY, 1);
}