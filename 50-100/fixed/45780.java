@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mCurrentLocation = location;
    if (((mLastLocation) != null) && ((geoPointFromLocation(location).distanceInKilometersTo(geoPointFromLocation(mLastLocation))) < (com.example.ruoxilu.criticalmass.MapsActivity.UPDATE_PIVOT))) {
        return ;
    }
    mLastLocation = location;
    updateUserLocation(geoPointFromLocation(location));
    updateZoom(location);
    doMapQuery();
}