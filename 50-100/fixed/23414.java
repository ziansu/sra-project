@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    updateLocationUI();
    getDeviceLocation();
    if ((mLastKnownLocation) != null) {
        MyCurrentLat = mLastKnownLocation.getLatitude();
        MyCurrentLong = mLastKnownLocation.getLongitude();
        android.support.v4.app.LoaderManager loaderManager = getSupportLoaderManager();
        loaderManager.restartLoader(be.ecam.mapeza.mapeza.nearElementList.QUERY_LOADER, queryURL, this);
    }
}