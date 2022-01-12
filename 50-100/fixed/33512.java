@java.lang.Override
public void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.preferences_notification);
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.M)) {
        ((android.preference.PreferenceCategory) (findPreference("pref_cat_config"))).removePreference(findPreference("pref_toggle_mute"));
    }
}