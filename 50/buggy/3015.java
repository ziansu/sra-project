public void notifyOnBoaredPassenger(java.lang.String passengerPhoneNumber) {
    com.dev.irsg.busassister.AppLogic.getInstance().setPassengerState(passengerPhoneNumber, PassengerData.PassengerState.ON_BOARDED);
    mAdapter.notifyDataSetChanged();
}