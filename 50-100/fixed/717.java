private boolean openGPSEnabled() {
    lm = ((android.location.LocationManager) (act.getSystemService(Context.LOCATION_SERVICE)));
    if (lm.isProviderEnabled(android.location.LocationManager.GPS_PROVIDER)) {
        return true;
    }
    android.widget.Toast.makeText(act, "Please enable GPS.", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    act.startActivityForResult(intent, 0);
    return false;
}