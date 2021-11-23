private java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> fillMarkerList(com.igorko.accesibleif.models.Element element, com.google.android.gms.maps.model.BitmapDescriptor markerIcon) {
    java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> markerList = new java.util.ArrayList();
    if ((element != null) && (markerIcon != null)) {
        com.google.android.gms.maps.model.MarkerOptions marker = addMarkerElement(element, markerIcon);
        markerList.add(marker);
    }
    return markerList;
}