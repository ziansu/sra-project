private void updateTechnicalInfo() {
    android.preference.PreferenceScreen screen = getPreferenceScreen();
    android.preference.Preference pref_technical_info = screen.findPreference("technical_info");
    android.preference.Preference pref_technical_network = screen.findPreference("technical_network");
    android.preference.Preference pref_technical_subscription = screen.findPreference("technical_subscription");
    pref_technical_info.setSummary(eu.faircode.netguard.Util.getGeneralInfo(this));
    pref_technical_network.setSummary(eu.faircode.netguard.Util.getNetworkInfo(this));
}