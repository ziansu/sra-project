public static com.google.android.gms.maps.model.LatLng getLocationFromAddress(android.content.Context context, java.lang.String address) {
    android.location.Geocoder geocoder = new android.location.Geocoder(context);
    try {
        java.util.List<android.location.Address> location = geocoder.getFromLocationName(address, 5);
        com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.get(0).getLatitude(), location.get(0).getLongitude());
        return latLng;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}