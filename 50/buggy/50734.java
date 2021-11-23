@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    viewPager.removeAllViews();
    fillViewPager();
    getLocation();
    lat = location.getLatitude();
    lng = location.getLongitude();
}