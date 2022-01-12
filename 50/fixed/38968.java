@java.lang.Override
public void onMapReady(final com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.i(net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.TAG, "GoogleMap is ready");
    setupGoogleMaps(googleMap);
    new net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.GetCountryDetailsAsyncTask().execute(0);
}