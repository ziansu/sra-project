@java.lang.Override
public void onMapReady(final com.google.android.gms.maps.GoogleMap map) {
    map.setMyLocationEnabled(true);
    globalMap = map;
    updateMapsView();
    map.setOnCameraChangeListener(new com.google.android.gms.maps.GoogleMap.OnCameraChangeListener() {
        @java.lang.Override
        public void onCameraChange(com.google.android.gms.maps.model.CameraPosition arg0) {
            globalMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(new com.google.android.gms.maps.model.LatLng(45.74968239082803, 4.852847680449486), 12));
            if (updateMapsView())
                moveCamera();
            
            map.setOnCameraChangeListener(null);
        }
    });
    map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
}