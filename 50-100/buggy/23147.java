public boolean isOutermostVehicle(microtrafficsim.core.logic.vehicles.machines.Vehicle vehicle) {
    for (int i = (index) - 1; i >= 0; i--) {
        edge.lanes.lockLane(i);
        boolean isOutermostVehicle = edge.lanes.isEmpty(i);
        edge.lanes.unlockLane(i);
        if (!isOutermostVehicle)
            return false;
        
    }
    return true;
}