@java.lang.Override
public void onAttachFragment(com.google.android.apps.dashclock.configuration.Fragment fragment) {
    if (fragment instanceof com.google.android.apps.dashclock.configuration.BaseSettingsActivity.ExtensionPreferenceFragment) {
        mFragment = ((com.google.android.apps.dashclock.configuration.BaseSettingsActivity.ExtensionPreferenceFragment) (fragment));
    }
}