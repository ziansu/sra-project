private void bindPreferenceSummaryToValue(android.preference.Preference preference) {
    preference.setOnPreferenceChangeListener(this);
    java.lang.String key = preference.getKey();
    android.util.Log.v("SettingsFragment", ("Sleep interval: " + key));
    onPreferenceChange(preference, android.preference.PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(key, getString(R.string.pref_snooze_default)));
}