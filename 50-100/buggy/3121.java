@java.lang.Override
public Travel.Itineraries.Itinerary createItinerary(Travel.Forms.ItineraryForm f) {
    Travel.Itineraries.Itinerary i = new Travel.Itineraries.FlightRoute(f);
    if (((i.getDepartureLocation()) != (i.getArrivalLocation())) && ((i.getStops().size()) == 2)) {
        throw new java.lang.IllegalArgumentException("Flight must have exactly 2 different stops to be valid");
    }
    return i;
}