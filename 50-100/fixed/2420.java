@permissions.dispatcher.NeedsPermission(value = { Manifest.permission.ACCESS_COARSE_LOCATION , Manifest.permission.ACCESS_FINE_LOCATION })
void updateCoordinates() {
    android.location.LocationManager lm = ((android.location.LocationManager) (getSystemService(by.vshkl.translate2.ui.activity.LOCATION_SERVICE)));
    boolean hasProvider = (lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) || (lm.isProviderEnabled(LocationManager.GPS_PROVIDER));
    if (hasProvider) {
        somethingWithMap();
    }else {
        by.vshkl.translate2.util.DialogUtils.showLocationTurnOnDialog(this);
    }
}