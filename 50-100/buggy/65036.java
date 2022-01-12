private void saveStatus() {
    android.content.SharedPreferences data = getSharedPreferences(KEY_SHARED_PREFERENCES_MAP, Context.MODE_PRIVATE);
    android.content.SharedPreferences.Editor edit = data.edit();
    edit.putBoolean(KEY_PATH_TRACKING_ENABLED, pathTrackingEnabled);
    edit.putBoolean(KEY_USE_EXTERNAL_GPS_DEVICE, useExternalGpsDevice);
    edit.putFloat(KEY_ZOOM_FACTOR, ((float) (currentZoom)));
    edit.commit();
}