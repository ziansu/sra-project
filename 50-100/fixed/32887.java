@java.lang.Override
public void onPause() {
    super.onPause();
    android.content.SharedPreferences.Editor mPreferenceEditor = mSharedPreferences.edit();
    mPreferenceEditor.putInt(Utility.KEY_PLACE_SECTION_NUMBER, getSectionNumber());
    mPreferenceEditor.putString(Utility.KEY_PLACE_LATITUDE, getLatitude().toString());
    mPreferenceEditor.putString(Utility.KEY_PLACE_LONGITUDE, getLongitude().toString());
    mPreferenceEditor.apply();
}