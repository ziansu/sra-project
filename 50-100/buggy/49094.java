@org.junit.Before
public void setUp() throws org.openbase.jul.exception.CouldNotPerformException {
    org.openbase.bco.registry.location.test.LocationRegistryTest.deviceRegistry.getDeviceConfigRegistry().clear();
    org.openbase.bco.registry.location.test.LocationRegistryTest.deviceRegistry.getUnitGroupRegistry().clear();
    org.openbase.bco.registry.location.test.LocationRegistryTest.locationRegistry.getLocationConfigRegistry().clear();
    org.openbase.bco.registry.location.test.LocationRegistryTest.locationRegistry.getConnectionConfigRegistry().clear();
    org.openbase.bco.registry.location.test.LocationRegistryTest.userRegistry.getUserRegistry().clear();
}