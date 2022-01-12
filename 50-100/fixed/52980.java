public int printMissedConnections() {
    int numberMissed = 0;
    for (Itinerary i : passengerItineraries) {
        if (((i.flightInfo1.realArrival) + (DataGenerator.TRANSIT_TIME)) > (i.flightInfo2.realDeparture)) {
            numberMissed++;
        }
    }
    java.lang.System.out.println(("NUMBER MISSED: " + numberMissed));
    return numberMissed;
}