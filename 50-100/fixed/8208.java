private void bindPreferenceSummaryToValue(android.preference.Preference preference) {
    preference.setOnPreferenceChangeListener(this);
    java.lang.String key = preference.getKey();
    onPreferenceChange(preference, android.preference.PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(key, getString(R.string.pref_snooze_default)));
}