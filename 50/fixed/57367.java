public com.samskivert.depot.impl.TableMetaData invoke(com.samskivert.depot.PersistenceContext ctx, java.sql.Connection conn, com.samskivert.depot.impl.jdbc.DatabaseLiaison dl) throws java.sql.SQLException {
    return new com.samskivert.depot.impl.TableMetaData(conn.getMetaData(), dl, tableName);
}