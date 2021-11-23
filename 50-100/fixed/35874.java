public java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> getPharmacyMarkers(java.util.ArrayList<com.igorko.accesibleif.models.Element> elementList) {
    java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> markerList = new java.util.ArrayList();
    for (com.igorko.accesibleif.models.Element element : elementList) {
        if (element != null) {
            markerList = fillMarkerList(markerList, element, com.igorko.accesibleif.utils.IconsUtils.setPharmacyIcon(element));
        }
    }
    return markerList;
}