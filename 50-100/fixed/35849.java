@java.lang.Override
public void onMyLocationChange(android.location.Location location) {
    try {
        com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
        updateMyPosition(latLng);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
}