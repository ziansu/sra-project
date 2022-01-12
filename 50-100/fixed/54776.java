@java.lang.Override
public void onMapReady(com.google.android.gms.maps.GoogleMap mMap) {
    googleMap = mMap;
    com.example.emile1.findaparty.Activity.MapStateManager mapStateManager = new com.example.emile1.findaparty.Activity.MapStateManager(getContext());
    com.google.android.gms.maps.model.CameraPosition cameraPosition = mapStateManager.getSavedCameraPosition();
    if (cameraPosition != null) {
        com.google.android.gms.maps.CameraUpdate update = com.google.android.gms.maps.CameraUpdateFactory.newCameraPosition(cameraPosition);
        googleMap.moveCamera(update);
        googleMap.setMapType(mapStateManager.getSavedMapType());
    }
}