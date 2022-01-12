public org.dashbuilder.dataset.DataSetMetadata getDataSetMetadata(org.dashbuilder.dataset.def.DataSetDef def) throws java.lang.Exception {
    org.dashbuilder.dataset.def.SQLDataSetDef sqlDef = ((org.dashbuilder.dataset.def.SQLDataSetDef) (def));
    javax.sql.DataSource ds = dataSourceLocator.lookup(sqlDef);
    java.sql.Connection conn = ds.getConnection();
    try {
        return _getDataSetMetadata(sqlDef, conn);
    } finally {
        conn.close();
    }
}