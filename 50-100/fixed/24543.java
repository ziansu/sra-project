private void validateDS(net.sourceforge.jtds.jdbcx.JtdsDataSource ds) {
    assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.DB, ds.getDatabaseName());
    assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.SERVER, ds.getServerName());
    assertEquals(1433, ds.getPortNumber());
    assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.USER, ds.getUser());
    assertEquals(org.ops4j.pax.jdbc.jtds.impl.JTDSDataSourceFactoryTest.PASSWORD, ds.getPassword());
}