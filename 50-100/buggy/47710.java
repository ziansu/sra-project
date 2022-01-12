public static android.location.Location randomLocation(com.jimandlisa.reportAircraftNoise.LocationUtils.LocationMode mode) {
    android.location.Location location = new android.location.Location((mode == (com.jimandlisa.reportAircraftNoise.LocationUtils.LocationMode.HOME) ? android.location.LocationManager.NETWORK_PROVIDER : android.location.LocationManager.GPS_PROVIDER));
    java.util.Random rand = new java.util.Random();
    location.setLatitude(com.jimandlisa.reportAircraftNoise.LocationUtils.randomLat(rand));
    location.setLongitude(com.jimandlisa.reportAircraftNoise.LocationUtils.randomLong(rand));
    return location;
}