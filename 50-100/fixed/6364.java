private void showLocation() {
    mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
    if ((mLastLocation) != null) {
        java.lang.Double latitude = mLastLocation.getLatitude();
        java.lang.Double longitude = mLastLocation.getLongitude();
        android.util.Log.d("location ", ((("Longitude : " + longitude) + " , Latitude :") + latitude));
    }else {
        android.util.Log.d("ERROR :", "ERROR");
    }
}