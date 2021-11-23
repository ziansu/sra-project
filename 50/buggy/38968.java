@java.lang.Override
public void onMapReady(final com.google.android.gms.maps.GoogleMap googleMap) {
    android.util.Log.i(net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.TAG, "GoogleMap is ready");
    setupGoogleMaps(googleMap);
    net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.CountryIdentifier countryIdentifier = new net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.CountryIdentifier();
    countryIdentifier.countryId = 1;
    countryIdentifier.year = 2000;
    new net.roughdesign.canyoufeedme.activities.CountryOverviewActivity.GetCountryDetailsAsyncTask().execute(countryIdentifier);
}