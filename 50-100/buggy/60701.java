@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    lastLocation = LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
    android.util.Log.d(com.ci.marcopolo.AutoPoloActivity.TAG, ("Longitude is " + (lastLocation.getLongitude())));
    android.util.Log.d(com.ci.marcopolo.AutoPoloActivity.TAG, ("Latitude is " + (lastLocation.getLatitude())));
    android.widget.Toast.makeText(this, "Connected to the Google API!", Toast.LENGTH_SHORT);
}