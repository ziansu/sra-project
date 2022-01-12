private com.smi.travel.datalayer.entity.BookingFlight getFlight(java.lang.String flightNo, com.smi.travel.datalayer.entity.BookingAirline airline) {
    java.util.Set<com.smi.travel.datalayer.entity.BookingFlight> flights = airline.getBookingFlights();
    for (com.smi.travel.datalayer.entity.BookingFlight flight : flights) {
        if (flightNo.equalsIgnoreCase(flight.getFlightNo())) {
            return flight;
        }
    }
    return null;
}