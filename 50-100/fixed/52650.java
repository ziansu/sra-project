public void testGetClusterId() {
    org.voltdb.TestVoltProcedure.GetClusterIdProcedure gcip = new org.voltdb.TestVoltProcedure.GetClusterIdProcedure();
    org.voltdb.ProcedureRunner runner = new org.voltdb.ProcedureRunner(gcip, site, org.voltdb.VoltDB.instance().getCatalogContext().database.getProcedures().get(org.voltdb.TestVoltProcedure.GetClusterIdProcedure.class.getName()));
    runner.setupTransaction(null);
    org.voltdb.client.ClientResponse r = runner.call(((java.lang.Object) (null)));
    assertEquals(expectedClusterId, gcip.clusterId);
    assertEquals(ClientResponse.SUCCESS, r.getStatus());
}