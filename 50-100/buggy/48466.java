@org.junit.Test
public void testExecuteQueryCommand() {
    dcNetworks.addAll(java.util.Arrays.asList(mockExternalNetwork, mockNonExternalNetwork));
    underTest.executeQueryCommand();
    final java.util.List<org.ovirt.engine.core.common.businessentities.network.Network> actual = underTest.getQueryReturnValue().getReturnValue();
    org.junit.Assert.assertThat(actual, org.hamcrest.Matchers.hasSize(1));
    org.junit.Assert.assertTrue(actual.contains(mockNonExternalNetwork));
}