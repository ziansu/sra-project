public void onPositiveButton(final java.lang.String tag) {
    if (org.deviceconnect.android.manager.setting.SettingsFragment.TAG_ORIGIN.equals(tag)) {
        mCheckBoxOauthPreferences.setChecked(false);
        mCheckBoxOriginBlockingPreferences.setChecked(false);
    }else
        if (org.deviceconnect.android.manager.setting.SettingsFragment.TAG_WEB_SERVER.equals(tag)) {
            startWebServer();
        }else
            if (org.deviceconnect.android.manager.setting.SettingsFragment.TAG_REQUIRE_ORIGIN.equals(tag)) {
                mCheckBoxRequireOriginPreferences.setChecked(true);
            }else
                if (org.deviceconnect.android.manager.setting.SettingsFragment.TAG_AVAILABILITY.equals(tag)) {
                    mCheckBoxManagerNameVisiblePreferences.setChecked(true);
                }
            
        
    
}