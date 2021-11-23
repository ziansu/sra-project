public int getRowCount(org.dashbuilder.dataset.def.SQLDataSetDef def) throws java.lang.Exception {
    javax.sql.DataSource ds = dataSourceLocator.lookup(def);
    java.sql.Connection conn = ds.getConnection();
    try {
        return _getRowCount(def, conn);
    } finally {
        conn.close();
    }
}