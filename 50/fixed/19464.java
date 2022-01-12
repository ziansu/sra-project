@org.junit.Before
public final void setupDriver() throws java.lang.Exception {
    configuration.setMinOfferScore(0);
    driver = driverSupplier.get().get();
    cacheCoordinator.activateLeaderCache();
    migrationRunner.checkMigrations();
}