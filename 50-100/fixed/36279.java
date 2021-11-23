@java.lang.Override
public void doneLocationTask(java.util.ArrayList<com.example.brandon.myfriendlocater.Marker> returnedLocations) {
    if (returnedLocations != null) {
        for (int i = 0; i < (returnedLocations.size()); i++) {
            com.example.brandon.myfriendlocater.Marker friendLocation = returnedLocations.get(i);
            com.google.android.gms.maps.model.LatLng friendLocationLatLng = new com.google.android.gms.maps.model.LatLng(java.lang.Double.parseDouble(friendLocation.lat), java.lang.Double.parseDouble(friendLocation.lng));
            mMap.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(friendLocationLatLng).title(friendLocation.username));
        }
    }
}