public void addArrival(com.davazriel.airtafficcontroller.model.Flight flight) {
    if (((notAllowedPlaneTypes) != null) && (notAllowedPlaneTypes.contains(flight.getPlaneType()))) {
        (violatedRestriction)++;
    }
    int minATA = getNextTimeRunwayAvailable(flight.getPlaneType());
    int ETA = flight.getETA(id);
    currentATA = (minATA > ETA) ? minATA : ETA;
    currentPlaneType = flight.getPlaneType();
    flight.setATA(currentATA);
    flight.setAssignedRunway(this);
}