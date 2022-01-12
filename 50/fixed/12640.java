protected boolean isLocationTimeouted(float speedKmh) {
    return speedKmh == (com.medziku.motoresponder.logic.UserRide.TIMEOUTED_SPEED_VALUE);
}