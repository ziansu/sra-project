public static java.util.List<com.google.android.gms.maps.model.LatLng> createRectangle(com.google.android.gms.maps.model.LatLng loc, double width, double height) {
    return java.util.Arrays.asList(new com.google.android.gms.maps.model.LatLng(loc.latitude, loc.longitude), new com.google.android.gms.maps.model.LatLng(loc.latitude, ((loc.longitude) + width)), new com.google.android.gms.maps.model.LatLng(((loc.latitude) + height), ((loc.longitude) + width)), new com.google.android.gms.maps.model.LatLng(((loc.latitude) + height), loc.longitude), new com.google.android.gms.maps.model.LatLng(loc.latitude, loc.longitude));
}