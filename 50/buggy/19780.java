@org.skife.jdbi.v2.sqlobject.SqlQuery(value = "SELECT (COUNT(table_name) = 8) " + (((("FROM information_schema.tables " + "WHERE table_name IN (") + "  'VERTEX', 'EDGE', 'PROPERTY', ") + "  'SESS_VERTEX', 'SESS_EDGE', 'SESS_PROPERTY', ") + "  'ID_GENERATOR', 'TRANSACTION')"))
boolean schemaTablesExist(@org.skife.jdbi.v2.sqlobject.Bind(value = "schema")
java.lang.String schema);