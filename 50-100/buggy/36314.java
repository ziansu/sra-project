@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (gameStarted) {
        float distance = calculateDistanceToFlag(location);
        java.lang.String longitude = "Longitude: " + (location.getLongitude());
        java.lang.String latitude = "Latitude: " + (location.getLatitude());
        java.lang.System.out.println(longitude);
        java.lang.System.out.println(latitude);
        java.lang.System.out.println((("Distance: " + distance) + " m"));
        sentHintVibration(distance);
    }
}