@java.lang.Override
public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    android.content.Intent intent = new android.content.Intent(getApplication(), drgn.cafemap.DetailPageActivity.class);
    com.google.android.gms.maps.model.LatLng latlng = marker.getPosition();
    boolean newMarkerFlag = false;
    if (marker.getTitle().equals("Make a new location"))
        newMarkerFlag = true;
    
    intent.putExtra("indexKey", ((java.lang.String.valueOf(latlng.latitude)) + (java.lang.String.valueOf(latlng.longitude))));
    startActivity(intent);
}