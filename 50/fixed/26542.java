@java.lang.Override
public void onSuccess(com.google.android.gms.location.LocationSettingsResponse locationSettingsResponse) {
    mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, android.os.Looper.myLooper());
}