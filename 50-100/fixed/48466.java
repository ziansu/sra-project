@org.junit.Test
public void testExecuteQueryCommand() {
    dcNetworks.addAll(java.util.Arrays.asList(mockExternalNetwork, mockNonExternalNetwork));
    underTest.executeQueryCommand();
    final java.util.List<org.ovirt.engine.core.common.businessentities.network.Network> actual = underTest.getQueryReturnValue().getReturnValue();
    org.junit.Assert.assertNotNull(actual);
    org.junit.Assert.assertEquals(1, actual.size());
    org.junit.Assert.assertTrue(actual.contains(mockNonExternalNetwork));
}