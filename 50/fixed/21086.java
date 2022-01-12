public java.util.List<net.eutkin.drivers.entity.Driver> getAllDrivers() {
    java.util.List<net.eutkin.drivers.entity.Driver> drivers = driverRepo.getAllDrivers();
    return drivers;
}