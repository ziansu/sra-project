public static void moveRideToTop(java.util.List<com.walmartlabs.classwork.rideone.models.Ride> rides, int currentPos) {
    if (currentPos > 0) {
        com.walmartlabs.classwork.rideone.models.Ride top = rides.get(0);
        rides.set(0, rides.get(currentPos));
        rides.set(currentPos, top);
    }
}