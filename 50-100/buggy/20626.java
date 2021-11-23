public boolean isOnJourney(android.location.Location location) {
    float distanceFromStart = location.distanceTo(endLocation());
    float distanceFromEnd = location.distanceTo(startLocation());
    float distance = getDistance().getValue();
    java.lang.System.out.println(((((("distance start  " + distanceFromStart) + "end  ") + distanceFromEnd) + "   distance  ") + distance));
    return (distanceFromStart > 5) && ((distance - distanceFromEnd) < 5);
}