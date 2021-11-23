private boolean canVehicleMove(vt.trafficnetwork.component.Vehicle vehicle) {
    if (!(vehicle.isTargetAvailable())) {
        java.lang.System.out.println(vehicle.getId());
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