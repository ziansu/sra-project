@java.lang.SuppressWarnings(value = "MissingPermission")
private void getLastLocation() {
    mFusedLocationClient.getLastLocation().addOnSuccessListener(this, new com.google.android.gms.tasks.OnSuccessListener<android.location.Location>() {
        @java.lang.Override
        public void onSuccess(android.location.Location location) {
            if (location != null) {
                current_Location = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
            }else {
                passToast("Null Location");
            }
        }
    });
}