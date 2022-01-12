protected float getCurrentSpeedKmh() {
    android.location.Location location = null;
    try {
        location = this.locationUtility.getAccurateLocation().get();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    if (location == null) {
        return com.medziku.motoresponder.logic.UserRide.TIMEOUTED_SPEED_VALUE;
    }
    float speedMs = location.getSpeed();
    return this.msToKmh(speedMs);
}