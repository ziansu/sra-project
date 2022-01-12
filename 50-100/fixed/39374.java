com.google.android.gms.maps.model.LatLng getLocation() {
    while (!(locationReady())) {
        android.os.Handler handler = new android.os.Handler();
        handler.postDelayed(new java.lang.Runnable() {
            public void run() {
            }
        }, 1000);
    } 
    com.google.android.gms.maps.model.LatLng currLoc = new com.google.android.gms.maps.model.LatLng(mLastLocation.getLatitude(), mLastLocation.getLongitude());
    locationsList.add(currLoc);
    return currLoc;
}