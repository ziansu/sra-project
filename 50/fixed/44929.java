@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    if ((callback) != null) {
        callback.onNestedScreenClicked(new org.broeuschmeul.android.gps.usb.ui.USBGpsSettingsFragment.RecordingPreferences());
    }
    return false;
}