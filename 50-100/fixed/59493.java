@java.lang.Override
public void freeParkingSpot(java.lang.String vehicleId, org.matsim.api.core.v01.Id<org.matsim.api.core.v01.network.Link> linkId) {
    org.matsim.contrib.carsharing.vehicles.CSVehicle vehicle = this.carsharingSupplyContainer.getVehicleWithId(vehicleId);
    org.matsim.contrib.carsharing.manager.supply.CompanyContainer companyContainer = this.carsharingSupplyContainer.getCompany(vehicle.getCompanyId());
    org.matsim.contrib.carsharing.manager.supply.VehiclesContainer vehiclesContainer = companyContainer.getVehicleContainer(vehicle.getCsType());
    ((org.matsim.contrib.carsharing.manager.supply.OneWayContainer) (vehiclesContainer)).freeParkingSpot(vehicle);
}