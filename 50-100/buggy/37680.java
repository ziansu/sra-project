public java.lang.Integer getForcastedDemandAtDepartureDate(java.lang.String flightNumber, java.lang.String cabinClass, org.joda.time.DateTime departureDateTime) {
    java.lang.Integer forcastedDemandAtDeparture = historicalBookingCache.getBookings(flightNumber, cabinClass, departureDateTime, 0);
    if (forcastedDemandAtDeparture == null) {
        forcastedDemandAtDeparture = forecastDemandUsingSimpleAverageMethod(historicalBookingCache.getBookingsAt(0, flightNumber, cabinClass, departureDateTime));
    }
    return forcastedDemandAtDeparture;
}