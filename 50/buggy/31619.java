public boolean onPreferenceClick(android.preference.Preference preference) {
    com.example.karmali.homexperts.SettingsActivity.sendFeedback(getActivity());
    return true;
}