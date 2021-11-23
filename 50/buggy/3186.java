@java.lang.Override
public void onLocationChanged(final android.location.Location location) {
    android.util.Log.d("google_api", ((("Location changed to " + (location.getLatitude())) + " ") + (location.getLongitude())));
    locationChanged(location);
}