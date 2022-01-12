public com.google.android.gms.maps.model.LatLng getLocationAsLatlng() {
    java.lang.String[] split = location.split(",");
    double latitude = java.lang.Double.parseDouble(split[0]);
    double longitude = java.lang.Double.parseDouble(split[1]);
    return new com.google.android.gms.maps.model.LatLng(latitude, longitude);
}