@org.junit.Test
public void testEnumRollup() throws java.io.IOException {
    testRolledupMetric(enumLocator, com.rackspacecloud.blueflood.service.BluefloodEnumRollup.class, com.rackspacecloud.blueflood.service.BluefloodEnumRollup.class);
    testEnumValidatorRunsFor5M(enumLocator, com.rackspacecloud.blueflood.service.BluefloodEnumRollup.class);
}