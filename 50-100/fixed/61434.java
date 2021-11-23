public java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> makeMarkerOptionsFromList() {
    java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions> markers = new java.util.ArrayList<com.google.android.gms.maps.model.MarkerOptions>();
    for (org.dimamir999.testapp.model.PhotoWithGeoTag userPhoto : viewedPhotos) {
        markers.add(new com.google.android.gms.maps.model.MarkerOptions().position(new com.google.android.gms.maps.model.LatLng(userPhoto.getLatitude(), userPhoto.getLongitude())).title(userPhoto.getDate().toString()));
    }
    return markers;
}