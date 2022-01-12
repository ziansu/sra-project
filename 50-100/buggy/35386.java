@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
        if (!(((android.location.LocationManager) (context.getSystemService(Context.LOCATION_SERVICE))).isProviderEnabled(LocationManager.GPS_PROVIDER))) {
            android.widget.Toast.makeText(context, "Intent Detected. OFF", Toast.LENGTH_LONG).show();
            GpsService.INSTANCE.deactivateGps();
        }else {
            android.widget.Toast.makeText(context, "Intent Detected. ON", Toast.LENGTH_LONG).show();
            GpsService.INSTANCE.activateGPS();
        }
    }
}