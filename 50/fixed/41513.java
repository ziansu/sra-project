public void setRideId(java.lang.String rideId) {
    if (rideId == null)
        remove(com.walmartlabs.classwork.rideone.models.User.COLUMN_RIDE);
    else
        put(com.walmartlabs.classwork.rideone.models.User.COLUMN_RIDE, rideId);
    
}