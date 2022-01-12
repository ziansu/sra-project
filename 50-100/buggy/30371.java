private boolean shouldReload(com.mapbox.mapboxsdk.geometry.LatLngBounds viewLatLngBounds) {
    if ((forceRefreshPoi) || (forceRefreshNotes)) {
        forceRefreshPoi = false;
        forceRefreshNotes = false;
        return true;
    }
    if (((previousZoom) != null) && ((previousZoom) < 15)) {
        return true;
    }
    return ((triggerReloadPoiLatLngBounds) == null) || (!(triggerReloadPoiLatLngBounds.union(viewLatLngBounds).equals(triggerReloadPoiLatLngBounds)));
}