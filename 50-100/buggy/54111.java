public java.sql.ResultSet getEnumsFromSource(java.sql.Connection connection) {
    java.sql.Statement stmt = null;
    java.lang.String query = null;
    java.sql.ResultSet rs = null;
    try {
        io.confluent.connect.jdbc.sink.dialect.DbDialect.log.info("enums from source");
        stmt = connection.createStatement();
        query = "SELECT t.typname, string_agg(\'\'\'\'||e.enumlabel||\'\'\'\', \',\' ORDER BY e.enumsortorder) AS enum_labels\n" + ((("FROM   pg_catalog.pg_type t \n" + "JOIN   pg_catalog.pg_namespace n ON n.oid = t.typnamespace \n") + "JOIN   pg_catalog.pg_enum e ON t.oid = e.enumtypid  \n") + "GROUP  BY 1");
        rs = stmt.executeQuery(query);
    } catch (java.lang.Exception e) {
        io.confluent.connect.jdbc.sink.dialect.DbDialect.log.info("Could not fetch enums");
        e.printStackTrace();
    }
    io.confluent.connect.jdbc.sink.dialect.DbDialect.log.info("Returning rs");
    return rs;
}