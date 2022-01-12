public java.util.List<trackerApplication.entity.Vehicle> getVehiclesByUsername(java.lang.String username) {
    java.util.List<trackerApplication.entity.Vehicle> vehicles = new java.util.ArrayList<>();
    org.hibernate.Session session = trackerApplication.persistence.SessionFactoryProvider.getSessionFactory().openSession();
    vehicles = ((java.util.List<trackerApplication.entity.Vehicle>) (session.get(trackerApplication.entity.Vehicle.class, username)));
    logger.info(("Username: " + username));
    logger.info(("Vehicles found: " + (vehicles.size())));
    return vehicles;
}