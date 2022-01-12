public void draw(com.google.android.gms.maps.GoogleMap map) {
    if (map == null)
        return ;
    
    if ((marker) == null) {
        marker = map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(location).title(name));
    }else {
        marker.setPosition(location);
    }
}