public void refreshMap() {
    new uwp.cs.edu.parkingtracker.mapping.MapTransform.MapTask().execute();
    android.util.Log.d("MAP", "REFRESH");
    if (isParked()) {
        mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().title("Parking Spot").position(parkingSpot).icon(com.google.android.gms.maps.model.BitmapDescriptorFactory.fromResource(R.drawable.parking)));
    }
}