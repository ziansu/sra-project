protected void buildIndexes(java.sql.DatabaseMetaData metaData, org.obeonetwork.dsl.database.Table table) {
    java.util.Map indices = new java.util.HashMap();
    java.sql.ResultSet rs = null;
    try {
        rs = metaData.getIndexInfo(null, schemaName, table.getName(), false, false);
        while (rs.next()) {
            buildIndex(metaData, table, rs, indices);
        } 
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    } finally {
        org.obeonetwork.dsl.database.reverse.utils.JdbcUtils.closeResultSet(rs);
    }
}