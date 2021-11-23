void startDriving(cz.cvut.fel.aic.agentpolis.simmodel.environment.congestion.VehicleTripData vehicleData) {
    cz.cvut.fel.aic.agentpolis.siminfrastructure.planner.trip.Trip<cz.cvut.fel.aic.agentpolis.simmodel.environment.transportnetwork.elements.SimulationNode> trip = vehicleData.getTrip();
    cz.cvut.fel.aic.agentpolis.simmodel.environment.congestion.Lane nextLane = null;
    if (trip.isEmpty()) {
        nextLane = getLaneForTripEnd();
        vehicleData.setTripFinished(true);
    }else {
        cz.cvut.fel.aic.agentpolis.simmodel.environment.transportnetwork.elements.SimulationNode nextLocation = trip.getAndRemoveFirstLocation();
        nextLane = getLaneByNextNode(nextLocation);
    }
    nextLane.startDriving(vehicleData);
}