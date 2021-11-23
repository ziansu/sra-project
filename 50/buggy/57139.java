@java.lang.Override
public void removeMarkerClicked(com.google.android.gms.maps.model.LatLng latLng) {
    mOnFocusChangedListener.onFocusChanged(null);
    mBikeStationData.removeMarkerSelection();
}