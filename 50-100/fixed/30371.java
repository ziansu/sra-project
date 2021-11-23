private boolean shouldReload(com.mapbox.mapboxsdk.geometry.LatLngBounds viewLatLngBounds) {
    if ((forceRefreshPoi) || (forceRefreshNotes)) {
        forceRefreshPoi = false;
        forceRefreshNotes = false;
        return true;
    }
    return ((((previousZoom) != null) && ((previousZoom) < 15)) || ((triggerReloadPoiLatLngBounds) == null)) || (!(triggerReloadPoiLatLngBounds.union(viewLatLngBounds).equals(triggerReloadPoiLatLngBounds)));
}