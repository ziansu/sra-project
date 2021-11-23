private com.pv165.airportmanagerpersistence.entity.Flight flight(java.util.Date departureTime, java.util.Date arrivalTime, com.pv165.airportmanagerpersistence.entity.Destination origin, com.pv165.airportmanagerpersistence.entity.Destination target, com.pv165.airportmanagerpersistence.entity.Plane plane) {
    com.pv165.airportmanagerpersistence.entity.Flight flight = new com.pv165.airportmanagerpersistence.entity.Flight();
    flight.setArrivalTime(arrivalTime);
    flight.setDepartureTime(departureTime);
    flight.setTarget(target);
    flight.setOrigin(origin);
    flight.setPlane(plane);
    flightService.create(flight);
    return flight;
}