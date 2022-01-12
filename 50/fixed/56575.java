public com.google.android.gms.maps.model.LatLng getLocation() {
    if ((latitude) != 0.0)
        return new com.google.android.gms.maps.model.LatLng(latitude, longitude);
    else
        return null;
    
}