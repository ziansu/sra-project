@java.lang.Override
public void onProviderDisabled(java.lang.String s) {
    android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    startActivity(intent);
}