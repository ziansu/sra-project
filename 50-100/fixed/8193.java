public boolean removeVehicle(org.matsim.api.core.v01.network.Link link, org.matsim.contrib.carsharing.vehicles.CSVehicle vehicle, java.lang.String type) {
    org.matsim.core.utils.collections.QuadTree<org.matsim.contrib.carsharing.vehicles.CSVehicle> vehicleLocations = currentRentals.get(type);
    if (vehicleLocations != null) {
        org.matsim.api.core.v01.Coord coord = link.getCoord();
        return vehicleLocations.remove(coord.getX(), coord.getY(), vehicle);
    }
    return false;
}