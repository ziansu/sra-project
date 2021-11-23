public boolean addVehicle(org.procrastinationpatients.tts.entities.Vehicle vehicle) {
    int cur_line = vehicle.getCur_line();
    for (int j = 0; j < (lane_Length); j++) {
        if ((lanes[cur_line].getVehicles()[j]) == null) {
            vehicle.setCur_Loc(j);
            this.vehicles.add(vehicle);
            this.lanes[cur_line].getVehicles()[j] = vehicle;
            return true;
        }
    }
    return false;
}