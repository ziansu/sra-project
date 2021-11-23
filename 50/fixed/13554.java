@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    startActivityForResult(intent, sk.henrichg.phoneprofilesplus.PhoneProfilesPreferencesNestedFragment.RESULT_LOCATION_SYSTEM_SETTINGS);
    return false;
}