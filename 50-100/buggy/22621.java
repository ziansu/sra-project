public void hideDoors() {
    if (!(mapboxMap.getMarkers().isEmpty())) {
        java.util.List<com.mapbox.mapboxsdk.annotations.Marker> listDoors = mapboxMap.getMarkers();
        for (int i = 0; i < (listDoors.size()); i++)
            mapboxMap.removeMarker(listDoors.get(i));
        
    }
}