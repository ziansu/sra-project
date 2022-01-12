private com.google.enterprise.adaptor.Acl getAcl(java.sql.Connection conn, java.lang.String uniqueId) throws java.sql.SQLException {
    try (java.sql.PreparedStatement stmt = getAclFromDb(conn, uniqueId);java.sql.ResultSet rs = stmt.executeQuery()) {
        com.google.enterprise.adaptor.database.DatabaseAdaptor.log.finer("got acl");
        java.sql.ResultSetMetaData metadata = rs.getMetaData();
        return com.google.enterprise.adaptor.database.DatabaseAdaptor.buildAcl(rs, metadata, aclPrincipalDelimiter, aclNamespace);
    }
}