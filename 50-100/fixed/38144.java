public java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> addMarkers(com.google.android.gms.maps.GoogleMap googleMap, java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> markerList) {
    if (googleMap != null) {
        googleMap.clear();
        if ((markerList != null) && (!(markerList.isEmpty()))) {
            for (com.google.android.gms.maps.model.MarkerOptions markerOptions : markerList) {
                if (markerOptions != null) {
                    googleMap.addMarker(markerOptions);
                }
            }
        }
    }
    return markerList;
}