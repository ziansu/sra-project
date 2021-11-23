private boolean canVehicleMove(vt.trafficnetwork.component.Vehicle vehicle) {
    if (!(vehicle.isTargetAvailable())) {
        return false;
    }
    if (!(vehicle.isThereVehicleAhead())) {
        return true;
    }
    if (vehicle.canMoveWithSameSpeed()) {
        return true;
    }
    messageManager.vehicleSpeedChange(vehicle, vehicle.getId(), vehicle.getTempSpeed(), simulationTime);
    return true;
}