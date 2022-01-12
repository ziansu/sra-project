@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.taibah.busservice.utils.DriverService.driverCurrentLocation = new com.google.android.gms.maps.model.LatLng(location.getLatitude(), location.getLongitude());
    com.taibah.busservice.utils.DriverService.driverCurrentSpeedInKilometers = java.lang.String.valueOf(((int) ((location.getSpeed()) * 1.60934)));
    if ((com.taibah.busservice.fragments.MapsFragment.mapsFragmentOpen) && ((com.taibah.busservice.utils.DriverService.driverCurrentLocation) != null)) {
        com.taibah.busservice.fragments.MapsFragment.updateDriverLocation();
    }
}