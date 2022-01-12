public java.lang.StringBuilder buildColumnString(java.sql.ResultSetMetaData rsMeta, java.lang.String except) throws java.sql.SQLException {
    java.lang.StringBuilder columns = new java.lang.StringBuilder();
    int columnCount = rsMeta.getColumnCount();
    for (int i = 2; i <= columnCount; i++) {
        if (!(rsMeta.getColumnName(i).contains(except))) {
            columns.append(rsMeta.getColumnName(i));
            if (i != columnCount)
                columns.append(",");
            
        }
    }
    return columns;
}