public void addCar(java.lang.String type, org.matsim.contrib.carsharing.vehicles.CSVehicle vehicle) {
    java.util.ArrayList<org.matsim.contrib.carsharing.vehicles.CSVehicle> currentVehicles = this.vehiclesPerType.get(type);
    if (currentVehicles == null)
        currentVehicles = new java.util.ArrayList<org.matsim.contrib.carsharing.vehicles.CSVehicle>();
    
    currentVehicles.add(vehicle);
    this.vehiclesPerType.put(type, currentVehicles);
    int currentNumberOfVehicles = this.numberOfvehiclesPerType.get(type);
    currentNumberOfVehicles++;
    this.numberOfvehiclesPerType.put(type, currentNumberOfVehicles);
}