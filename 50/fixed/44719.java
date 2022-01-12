public static void resetHasSetDefaultValues() {
    android.content.SharedPreferences sp = org.andstatus.app.util.SharedPreferencesUtil.getSharedPreferences(PreferenceManager.KEY_HAS_SET_DEFAULT_VALUES);
    if (sp != null) {
        sp.edit().clear().commit();
    }
    org.andstatus.app.util.SharedPreferencesUtil.forget();
}