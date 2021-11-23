public int printMissedConnections() {
    int numberMissed = 0;
    for (Itinerary i : passengerItineraries) {
        if ((i.flightInfo1.realArrival) > ((i.flightInfo2.realDeparture) + (DataGenerator.TRANSIT_TIME))) {
            numberMissed++;
        }
    }
    java.lang.System.out.println(("NUMBER MISSED: " + numberMissed));
    return numberMissed;
}