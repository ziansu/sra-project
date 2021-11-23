public void addPokeBusColor(java.lang.String busCode) {
    android.util.Log.i("AddMarkers", "addPokeBusColor");
    com.google.android.gms.maps.model.Marker marker = markerHashTable.get(busCode);
    if (marker != null) {
        android.util.Log.i("AddMarkers", "  I R FAV BUS ");
        marker.setIcon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.ic_map_marker_white_blue36dp));
    }
}