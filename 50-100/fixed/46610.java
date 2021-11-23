public java.util.List<edu.sjsu.models.Flight> getFlights(java.lang.String[] flightList) {
    java.util.List<edu.sjsu.models.Flight> flights = new java.util.ArrayList<>();
    if (flightList != null) {
        for (java.lang.String flightNumber : flightList) {
            flights.add(flightdao.getFlight(flightNumber));
        }
    }
    return flights;
}