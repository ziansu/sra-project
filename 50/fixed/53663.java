public void updateRides(java.util.List<com.labs.okey.oneride.model.Ride> rides) {
    this.mRides = rides;
    com.labs.okey.oneride.myrides.GeneralMyRidesFragment.getInstance().updateRides(rides);
}