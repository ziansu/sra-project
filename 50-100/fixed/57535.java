@java.lang.Override
public void onConnected(@android.support.annotation.Nullable
android.os.Bundle bundle) {
    android.location.Location currLocation;
    if (com.ck.taxoteam.taxodriver.tools.PermitionsHelper.checkLocationPermitions(this)) {
        currLocation = LocationServices.FusedLocationApi.getLastLocation(client);
        currCoords = new com.google.android.gms.maps.model.LatLng(currLocation.getLatitude(), currLocation.getLongitude());
        com.google.android.gms.maps.model.LatLng toCoords = new com.google.android.gms.maps.model.LatLng(currentOrder.getFromCoords().getLatitude(), currentOrder.getFromCoords().getLongitude());
        getRouteResponse(currCoords, toCoords, R.color.color_route_from_me_to_start_points);
    }
}