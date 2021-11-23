public boolean isOnJourney(android.location.Location location) {
    float distanceFromEnd = location.distanceTo(endLocation());
    float distanceFromStart = location.distanceTo(startLocation());
    float distance = getDistance().getValue();
    java.lang.System.out.println(((((("distance start  " + distanceFromStart) + "end  ") + distanceFromEnd) + "   distance  ") + distance));
    return (distanceFromStart > 5) && (distanceFromEnd > 5);
}