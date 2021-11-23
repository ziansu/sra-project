@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (key.equals(bitrateStringKey)) {
        int bitrateValue = sharedPreferences.getInt(bitrateStringKey, java.lang.Integer.parseInt(getString(R.string.pref_startbitratevalue_default)));
        if (bitrateValue == 0) {
            setDefaultstartingBitrate(sharedPreferences);
            return ;
        }
        int startBitrate = bitrateValue;
        if (startBitrate > (com.quickblox.sample.groupchatwebrtc.activities.SettingsActivity.MAX_VIDEO_START_BITRATE)) {
            com.quickblox.sample.core.utils.Toaster.longToast(("Max value is:" + (com.quickblox.sample.groupchatwebrtc.activities.SettingsActivity.MAX_VIDEO_START_BITRATE)));
            setDefaultstartingBitrate(sharedPreferences);
        }
    }
}