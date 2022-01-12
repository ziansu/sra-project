private void setCameraFocus() {
    com.google.android.gms.maps.model.LatLngBounds.Builder builder = new com.google.android.gms.maps.model.LatLngBounds.Builder();
    if ((mDBFenceList.size()) >= 1) {
        for (org.dhbw.geo.database.DBFence fence : mDBFenceList) {
            builder.include(fence.getLatLng());
        }
        com.google.android.gms.maps.model.LatLngBounds bounds = builder.build();
        int padding = 60;
        com.google.android.gms.maps.CameraUpdate cameraUpdate = com.google.android.gms.maps.CameraUpdateFactory.newLatLngBounds(bounds, padding);
        mMap.moveCamera(cameraUpdate);
    }
}