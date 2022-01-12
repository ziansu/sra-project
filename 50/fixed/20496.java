void startDriving(cz.cvut.fel.aic.agentpolis.simmodel.environment.congestion.VehicleTripData vehicleTripData) {
    addToStartHereQueue(vehicleTripData);
    handleChange();
}