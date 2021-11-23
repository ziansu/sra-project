@java.lang.Override
public void onFinished(com.google.android.gms.maps.model.LatLng result) {
    if (result != null) {
        com.google.android.gms.maps.model.Marker city = map.addMarker(new com.google.android.gms.maps.model.MarkerOptions().position(result).title(name));
        android.util.Log.e("dsadsadsa", result.toString());
        map.moveCamera(com.google.android.gms.maps.CameraUpdateFactory.newLatLngZoom(result, 2));
        map.animateCamera(com.google.android.gms.maps.CameraUpdateFactory.zoomTo(15), 2000, null);
    }else {
        android.util.Log.e("NIE MA CHUJA", "DSADSA");
    }
}