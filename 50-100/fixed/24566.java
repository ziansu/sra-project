public void removeVehicle(org.procrastinationpatients.tts.entities.Vehicle vehicle) {
    int v_line = vehicle.getCur_line();
    int v_location = vehicle.getCur_Loc();
    if ((lanes[v_line].getVehicles()[v_location]) != null) {
        this.lanes[v_line].removeVehicle(vehicle);
    }
}