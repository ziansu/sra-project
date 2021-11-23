private float calculateDistanceToTheNextRadar(java.lang.Double latitude, java.lang.Double longitude) {
    android.location.Location currentLocation = com.mobilemakers.juansoler.appradar.StartScreenFragment.getLastLocation();
    android.location.Location nextLocation = createTheNextLocation(latitude, longitude);
    float distance = (currentLocation.distanceTo(nextLocation)) / 1000;
    return new java.math.BigDecimal(distance).setScale(1, java.math.BigDecimal.ROUND_HALF_UP).floatValue();
}