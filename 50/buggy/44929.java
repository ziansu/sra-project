@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    callback.onNestedScreenClicked(new org.broeuschmeul.android.gps.usb.ui.USBGpsSettingsFragment.RecordingPreferences());
    return false;
}