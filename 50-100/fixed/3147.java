private java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> fillMarkerList(java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> markerList, com.igorko.accesibleif.models.Element element, com.google.android.gms.maps.model.BitmapDescriptor markerIcon) {
    if ((element != null) && (markerIcon != null)) {
        com.google.android.gms.maps.model.MarkerOptions marker = addMarkerElement(element, markerIcon);
        markerList.add(marker);
    }
    return markerList;
}