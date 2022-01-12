@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    android.util.Log.d(jp.ac.titech.itpro.sdl.simplemap.MainActivity.TAG, ("onLocationChanged: " + location));
    Lat = location.getLatitude();
    Long = location.getLongitude();
    googleMap.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLng(new com.google.android.gms.maps.model.LatLng(Lat, Long)));
    java.lang.System.out.println("------------------------------");
    java.lang.System.out.println(Lat);
    java.lang.System.out.println(Long);
    java.lang.System.out.println("------------------------------");
    test1();
}