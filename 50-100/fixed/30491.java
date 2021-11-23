public void dropCarPin(android.view.View view) {
    if ((Car) == null) {
        com.google.android.gms.maps.model.LatLng curpos = Person.getPosition();
        Car = new com.google.android.gms.maps.model.MarkerOptions().position(curpos).title("Your car is here.");
        mMap.addMarker(Car);
        mMap.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(curpos));
    }
}