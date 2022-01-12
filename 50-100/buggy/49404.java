@java.lang.Override
public java.lang.Iterable<airlines.model.Flight> findAll(java.lang.String source, java.lang.String destination, java.lang.String arrival, java.lang.String departure) {
    airlines.model.FlightInfo flightInfo = new airlines.model.FlightInfo(source, destination, arrival, departure);
    java.util.List<airlines.model.Flight> paginatedFlights = flightProcessor.findWantedFlights(flightRepository.findAll(), flightInfo);
    return paginatedFlights;
}