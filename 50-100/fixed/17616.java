@org.junit.Test
public void testGetOpenflowVersion() throws java.lang.Exception {
    java.lang.Thread.sleep(5000);
    org.opendaylight.ovsdb.lib.notation.Version ovsVersion = this.getOvsVersion();
    if ((ovsVersion.compareTo(Constants.OPENFLOW13_SUPPORTED)) >= 0) {
        org.junit.Assert.assertEquals(Constants.OPENFLOW13, netVirtConfigurationService.getOpenflowVersion(node));
    }
}