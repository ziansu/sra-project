@java.lang.Override
public void onClick(android.view.View view) {
    first_start = true;
    last_time = (java.lang.System.currentTimeMillis()) / 1000;
    android.content.Intent intent = new android.content.Intent(this, com.androidplot.demos.ActivityRecognizedService.class);
    pendingIntent = android.app.PendingIntent.getService(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    ActivityRecognition.ActivityRecognitionApi.requestActivityUpdates(mApiClient, 3000, pendingIntent);
    locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER, 0, 0, this);
}