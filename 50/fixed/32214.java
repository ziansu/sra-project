private void bindPreferenceSummaryToValue(android.preference.Preference preference) {
    this.onPreferenceChange(preference, android.preference.PreferenceManager.getDefaultSharedPreferences(preference.getContext()).getString(preference.getKey(), ""));
}