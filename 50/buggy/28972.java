private boolean existVehicle(prototype.model.Vehicle vehicle) {
    return (vehicleDao.getByKey("plateNumber", vehicle.getPlateNumber())) == null;
}