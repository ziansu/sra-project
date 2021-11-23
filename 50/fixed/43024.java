@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    marker.showInfoWindow();
    updatePanelHeader(marker);
    updatePanelHeaderButton(marker);
    mLastMarker = marker;
    return true;
}