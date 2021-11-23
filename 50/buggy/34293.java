@java.lang.Override
public void onMapLongClick(com.google.android.gms.maps.model.LatLng ll) {
    com.digitalartthingy.witw.CustomMarker customMarker = new com.digitalartthingy.witw.CustomMarker(ll);
    com.digitalartthingy.witw.MarkerDetails details = new com.digitalartthingy.witw.MarkerDetails();
    details.enterDetails(mContext, customMarker);
    mMarkerStorage.addNewMarker(customMarker);
}