private void validateDS(net.sourceforge.jtds.jdbcx.JtdsDataSource ds) {
    org.junit.Assert.assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.DB, ds.getDatabaseName());
    org.junit.Assert.assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.SERVER, ds.getServerName());
    org.junit.Assert.assertEquals(1433, ds.getPortNumber());
    org.junit.Assert.assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.USER, ds.getUser());
    org.junit.Assert.assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.PASSWORD, ds.getPassword());
}