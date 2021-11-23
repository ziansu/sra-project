@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    latitude = java.lang.String.valueOf(location.getLatitude());
    longitude = java.lang.String.valueOf(location.getLongitude());
    prepareThings(pageNumber);
    android.util.Log.d("locaGPS>>", (((latitude) + ">>>") + (longitude)));
}