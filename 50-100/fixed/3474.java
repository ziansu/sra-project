private void getMarkersFromServer() {
    com.google.android.gms.maps.model.LatLngBounds bounds = mMap.getProjection().getVisibleRegion().latLngBounds;
    int zoomLevel = ((int) (mMap.getCameraPosition().zoom));
    if (zoomLevel >= (il.co.anyway.app.MainActivity.MINIMUM_ZOOM_LEVEL_TO_SHOW_ACCIDENTS))
        il.co.anyway.app.Utility.getMarkersByParameters(bounds, zoomLevel, this, false);
    else
        new il.co.anyway.app.FetchClusteredAccidents(bounds, zoomLevel, this);
    
}