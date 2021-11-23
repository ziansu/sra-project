public void getLastLocation() {
    android.util.Log.d(com.setmusic.bitmine.BitmineMainActivity.TAG, "getLastLocation");
    android.location.Criteria criteria = new android.location.Criteria();
    locationManager = ((android.location.LocationManager) (this.getSystemService(Context.LOCATION_SERVICE)));
    java.lang.String provider = locationManager.getBestProvider(criteria, true);
    storeLocation();
}