@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    addPreferencesFromResource(R.xml.other_sound_settings);
    mContext = getActivity();
    for (com.android.settings.notification.SettingPref pref : com.android.settings.notification.OtherSoundSettings.PREFS) {
        pref.init(this);
    }
    cyanogenmod.hardware.CMHardwareManager hardware = cyanogenmod.hardware.CMHardwareManager.getInstance(mContext);
    if (!(hardware.isSupported(CMHardwareManager.FEATURE_VIBRATOR))) {
        android.preference.Preference preference = findPreference(com.android.settings.notification.OtherSoundSettings.KEY_VIBRATION_INTENSITY);
        if (preference != null) {
            getPreferenceScreen().removePreference(preference);
        }
    }
}