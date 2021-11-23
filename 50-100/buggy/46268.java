private java.util.List<com.google.android.gms.maps.model.LatLng> createPositionList(com.google.android.gms.maps.model.LatLng currentPosition, android.util.ArrayMap<java.lang.String, com.google.android.gms.maps.model.Marker> markerArrayMap) {
    java.util.List<com.google.android.gms.maps.model.LatLng> positions = new java.util.ArrayList<>();
    positions.add(currentPosition);
    for (java.lang.String key : markerArrayMap.keySet()) {
        positions.add(new com.google.android.gms.maps.model.LatLng(markerArrayMap.get(key).getPosition().latitude, markerArrayMap.get(key).getPosition().longitude));
    }
    return positions;
}