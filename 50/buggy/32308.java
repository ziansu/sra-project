private void displayPreferenceFragment() {
    getChildFragmentManager().beginTransaction().add(R.id.settings_preferences_container, new com.pyamsoft.padlock.app.settings.SettingsPreferenceFragment()).commit();
}