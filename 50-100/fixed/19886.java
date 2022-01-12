private com.tsystems.javaschool.logiweb.entities.Driver populateAllowedDriverFieldsFromModel(com.tsystems.javaschool.logiweb.entities.Driver driverToPopulate, com.tsystems.javaschool.logiweb.model.DriverModel source) {
    com.tsystems.javaschool.logiweb.entities.City city = new com.tsystems.javaschool.logiweb.entities.City();
    city.setId(source.getCurrentCityId());
    driverToPopulate.setCurrentCity(city);
    driverToPopulate.setEmployeeId(source.getEmployeeId());
    driverToPopulate.setSurname(source.getSurname());
    driverToPopulate.setName(source.getName());
    return driverToPopulate;
}