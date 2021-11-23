@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    org.unpidf.univmobile.data.entities.Poi poi = mMarkers.get(marker);
    showPoiDetails(mTabPosition, poi);
    return true;
}