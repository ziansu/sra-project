@java.lang.Override
public void updateCarsAgeJob() {
    final java.util.List<com.coelleonline.quartz.dbentities.Car> cars = readAll();
    final java.time.Instant now = java.time.Instant.now();
    com.coelleonline.quartz.services.CarServiceImpl.LOGGER.info("Car age update job started.");
    for (com.coelleonline.quartz.dbentities.Car car : cars) {
        final java.time.LocalDate manufactureDate = car.getManufactureDate();
        final long age = manufactureDate.until(now, java.time.temporal.ChronoUnit.YEARS);
        car.setAge(age);
        save(car);
        com.coelleonline.quartz.services.CarServiceImpl.LOGGER.info(("Car age updated---" + car));
    }
    com.coelleonline.quartz.services.CarServiceImpl.LOGGER.info("Car age update job completed successfully");
}