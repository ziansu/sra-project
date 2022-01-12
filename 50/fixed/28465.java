static long getInstallDate(android.content.Context context) {
    return hotchemi.android.rate.PreferenceHelper.getPreferences(context).getLong(hotchemi.android.rate.PreferenceHelper.PREF_KEY_INSTALL_DATE, new java.util.Date().getTime());
}