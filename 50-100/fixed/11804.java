private java.lang.String getLongitude() {
    android.location.LocationManager lm = ((android.location.LocationManager) (getSystemService(Context.LOCATION_SERVICE)));
    android.location.Location location = lm.getLastKnownLocation(lm.getBestProvider(new android.location.Criteria(), true));
    return java.lang.String.valueOf(location.getLongitude());
}