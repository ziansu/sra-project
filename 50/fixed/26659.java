@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    android.util.Log.d("Preference changed", key);
    com.tomer.dtfc.Preferences.initialize(getApplicationContext());
    if (Preferences.enabled) {
        killBrodcastReciever();
        startBrodcastReciever();
    }else
        killBrodcastReciever();
    
}