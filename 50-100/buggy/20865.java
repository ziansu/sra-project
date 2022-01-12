private android.location.Location getLocation() {
    if (LocationServices.FusedLocationApi.getLocationAvailability(locationClient).isLocationAvailable()) {
        return LocationServices.FusedLocationApi.getLastLocation(locationClient);
    }else {
        showErrorDialog(null, "Please enable GPS service!", null);
        android.location.Location targetLocation = new android.location.Location("");
        targetLocation.setLatitude(43.7);
        targetLocation.setLongitude(79.4);
        return targetLocation;
    }
}