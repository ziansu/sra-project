@org.junit.Test
public void testAclSqlResultSetHasNoRecord() throws java.sql.SQLException {
    com.google.enterprise.adaptor.Acl golden = com.google.enterprise.adaptor.Acl.EMPTY;
    com.google.enterprise.adaptor.database.JdbcFixture.executeUpdate("create table acl");
    java.sql.ResultSet rs = com.google.enterprise.adaptor.database.JdbcFixture.executeQuery("select * from acl");
    java.sql.ResultSetMetaData metadata = rs.getMetaData();
    com.google.enterprise.adaptor.Acl acl = com.google.enterprise.adaptor.database.DatabaseAdaptor.buildAcl(rs, metadata, ",", com.google.enterprise.adaptor.Principal.DEFAULT_NAMESPACE);
    org.junit.Assert.assertEquals(golden, acl);
}