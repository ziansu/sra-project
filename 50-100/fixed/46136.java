@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    if (((boolean) (newValue)))
        mSoundPreference.setSummary(getResources().getString(R.string.setting_sound_on));
    else
        mSoundPreference.setSummary(getResources().getString(R.string.setting_sound_off));
    
    android.content.SharedPreferences.Editor ed = prefs.edit();
    ed.putBoolean("sound_preference_key", ((boolean) (newValue)));
    ed.apply();
    return true;
}