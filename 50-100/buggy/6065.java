@java.lang.Override
public void onConnected(android.os.Bundle connectionHint) {
    com.gcw.sapienza.places.services.LocationService.locationService = this;
    android.util.Log.d(com.gcw.sapienza.places.services.LocationService.TAG, "Connected to Google Api");
    android.location.Location currentLocation = com.gcw.sapienza.places.services.LocationService.fusedLocationProviderApi.getLastLocation(com.gcw.sapienza.places.services.LocationService.googleApiClient);
    if (currentLocation != null) {
        this.location = currentLocation;
        queryParsewithLocation(currentLocation);
        updateApplication();
    }
    com.gcw.sapienza.places.services.LocationService.fusedLocationProviderApi.requestLocationUpdates(com.gcw.sapienza.places.services.LocationService.googleApiClient, com.gcw.sapienza.places.services.LocationService.locationRequest, this);
}