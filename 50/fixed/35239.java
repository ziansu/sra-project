public boolean validateDistance(com.google.android.gms.maps.model.LatLng passengerLocation, com.google.android.gms.maps.model.LatLng userLocation) {
    return (distance(passengerLocation.latitude, passengerLocation.longitude, userLocation.latitude, userLocation.longitude)) <= 0.1;
}