public void startNewTrip() {
    avgSpeedArrayList = new java.util.ArrayList<>();
    routes = new java.util.ArrayList<>();
    java.util.Calendar currentCalendarInstance = java.util.Calendar.getInstance();
    tripStartTime = currentCalendarInstance.getTime().getTime();
    currentTripId = tripData.getTrips().size();
    java.util.Date date = currentCalendarInstance.getTime();
    java.lang.String formattedDate = com.example.aprokopenko.triphelper.utils.util_methods.UtilMethods.parseDate(date);
    com.example.aprokopenko.triphelper.datamodel.Trip trip = new com.example.aprokopenko.triphelper.datamodel.Trip(currentTripId, formattedDate);
    trip.setRoute(routes);
    tripData.addTrip(trip);
}