public java.lang.StringBuffer processColumnNames(java.sql.ResultSetMetaData rsmd, int numColumns) throws java.sql.SQLException {
    java.lang.StringBuffer res = new java.lang.StringBuffer();
    for (int i = 1; i < numColumns; i++) {
        if (i == (numColumns - 1)) {
            res.append(rsmd.getColumnName((i + 1)));
        }else {
            res.append(((rsmd.getColumnName((i + 1))) + " "));
        }
    }
    return res;
}