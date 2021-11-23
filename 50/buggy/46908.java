public java.lang.String getPassengerString(android.content.Context context) {
    android.content.res.Resources res = context.getResources();
    java.lang.String passengers = res.getQuantityString(R.plurals.numberOfPassengers, this.getPassengerNumber(), this.getPassengerNumber());
    return passengers;
}