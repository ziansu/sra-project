public void selectOneWayFlightSearchFields(java.lang.String origin, java.lang.String destination, java.lang.String departureDate, java.lang.String passengerInfo, java.lang.String passengerClass) throws java.lang.Exception {
    enterOrigin(origin);
    enterDestination(destination);
    selectDepartureDate(departureDate);
    specifyPassengerInfo(passengerInfo);
    selectPassengerClass(passengerClass);
    clickDoneButtonInPassengerBox();
    com.Yatra.Utils.Log.event("Successfully selected OneWay Flight Search fields");
}