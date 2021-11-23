public java.util.List<trackerApplication.entity.Vehicle> getVehiclesByUsername(java.lang.String username) {
    java.util.List<trackerApplication.entity.Vehicle> vehicles = new java.util.ArrayList<>();
    org.hibernate.Session session = trackerApplication.persistence.SessionFactoryProvider.getSessionFactory().openSession();
    vehicles = session.createCriteria(trackerApplication.entity.Vehicle.class, username).list();
    logger.info(("Username: " + username));
    logger.info(("Vehicles found: " + (vehicles.size())));
    return vehicles;
}