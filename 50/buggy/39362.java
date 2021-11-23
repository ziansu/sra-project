@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mapView.onDestroy();
    preferencesEditor = sharedPreferences_settings.edit();
    preferencesEditor.putBoolean(getString(R.string.preferences_is_driving), true);
    preferencesEditor.commit();
}