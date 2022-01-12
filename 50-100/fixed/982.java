private void newLocationFromLatLng(com.google.android.gms.maps.model.LatLng latLng) {
    android.util.Log.d("MyMapsActivity", "newLocationFromLatLng");
    ui.component.MarkerManager markerManager = ui.component.MarkerManager.getInstance();
    java.util.Hashtable<java.lang.String, com.google.android.gms.maps.model.Marker> markerHashTable = markerManager.getMarkerHashTable();
    onMapPresedLatLng = latLng;
    markerHashTable.clear();
    ui.activity.MainActivity.googleMap.clear();
    progressBar.setVisibility(view.VISIBLE);
    ui.activity.MainActivity.zoom = ui.activity.MainActivity.googleMap.getCameraPosition().zoom;
    ui.activity.MainActivity.bearing = ui.activity.MainActivity.googleMap.getCameraPosition().bearing;
    selectCorrectLatLng();
}