public static android.location.Location randomLocation() {
    android.location.Location location = new android.location.Location(android.location.LocationManager.GPS_PROVIDER);
    java.util.Random rand = new java.util.Random();
    location.setLatitude(com.jimandlisa.reportAircraftNoise.LocationUtils.randomLat(rand));
    location.setLongitude(com.jimandlisa.reportAircraftNoise.LocationUtils.randomLong(rand));
    return location;
}