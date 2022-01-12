@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.support.v4.app.NotificationCompat.Builder builder = createNotification();
    createRestartAppIntent(builder);
    notify(builder);
    if (!(com.example.aprokopenko.triphelper.utils.util_methods.UtilMethods.checkPermission(getApplicationContext()))) {
        if (com.example.aprokopenko.triphelper.utils.settings.ConstantValues.LOGGING_ENABLED) {
            android.util.Log.i(com.example.aprokopenko.triphelper.service.LocationService.LOG_TAG, ((("onConnected: " + (googleApiClient)) + (locationRequest)) + (gmsLocationListener)));
        }
        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, gmsLocationListener);
    }else {
    }
}