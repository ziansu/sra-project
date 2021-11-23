public com.google.android.gms.maps.model.PolylineOptions getPolylineOptions(com.google.android.gms.maps.model.LatLngBounds.Builder latLngBoundsBuilder, com.zlate87.sample_transport_app.feature.routing.viewmodel.PolylineData polylineData) {
    com.google.android.gms.maps.model.PolylineOptions polyline = new com.google.android.gms.maps.model.PolylineOptions();
    java.lang.String encodedValue = polylineData.getEncodedValue();
    if (encodedValue == null) {
        return null;
    }
    java.util.List<com.google.android.gms.maps.model.LatLng> latLngList = com.google.maps.android.PolyUtil.decode(encodedValue);
    for (com.google.android.gms.maps.model.LatLng latLng : latLngList) {
        latLngBoundsBuilder.include(latLng);
    }
    polyline.addAll(latLngList);
    polyline.color(polylineData.getColor());
    return polyline;
}