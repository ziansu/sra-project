public void addCar(java.lang.String type, org.matsim.contrib.carsharing.vehicles.CSVehicle vehicle) {
    java.util.ArrayList<org.matsim.contrib.carsharing.vehicles.CSVehicle> currentVehicles = this.vehiclesPerType.get(type);
    currentVehicles.add(vehicle);
    int currentNumberOfVehicles = this.numberOfvehiclesPerType.get(type);
    currentNumberOfVehicles++;
    this.numberOfvehiclesPerType.put(type, currentNumberOfVehicles);
}