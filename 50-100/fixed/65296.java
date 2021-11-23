private static java.util.ArrayList<java.util.ArrayList<com.FlightSearch.models.ScheduledFlight>> getScheduledIndirectFlights(java.sql.ResultSet resultSet) throws java.sql.SQLException {
    java.util.ArrayList<java.util.ArrayList<com.FlightSearch.models.ScheduledFlight>> scheduledFlights = new java.util.ArrayList<>();
    while (resultSet.next()) {
        java.util.ArrayList<com.FlightSearch.models.ScheduledFlight> flights = com.FlightSearch.parsers.ParseResult.parseIndirectResult(resultSet);
        if (flights != null) {
            scheduledFlights.add(flights);
        }
    } 
    return scheduledFlights;
}