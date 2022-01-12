public void hideDoors() {
    if (!(mapboxMap.getMarkers().isEmpty())) {
        for (int i = 0; i < (mapboxMap.getMarkers().size()); i++)
            mapboxMap.removeMarker(mapboxMap.getMarkers().get(i));
        
    }
}