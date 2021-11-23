protected static void shouldBeValidApiVersion() {
    java.lang.String ZEUS_API_VERSION = "7.3r1";
    try {
        org.junit.Assert.assertEquals(ZEUS_API_VERSION, org.openstack.atlas.adapter.itest.ZeusTestBase.getServiceStubs().getSystemMachineInfoBinding().getProductVersion());
    } catch (java.rmi.RemoteException e) {
        e.printStackTrace();
        org.junit.Assert.fail(e.getMessage());
    }
}