@java.lang.Override
public final void onCreate(final android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.behavior_preferences);
    android.preference.Preference overrideBackButtonPreference = findPreference(getString(R.string.override_navigation_icon_preference_key));
    overrideBackButtonPreference.setOnPreferenceChangeListener(createOverrideBackButtonChangeListener());
    android.preference.Preference hideNavigationPreference = findPreference(getString(R.string.hide_navigation_preference_key));
    hideNavigationPreference.setOnPreferenceChangeListener(createHideNavigationChangeListener());
    addRestoreDefaultsListener(new de.mrapp.android.preference.activity.example.fragment.RestoreDefaultsDialogListener(getActivity()));
    addRestoreDefaultsListener(this);
}