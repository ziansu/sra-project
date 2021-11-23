private void addFileColsToAvailableCols(de.hpi.hpcc.parsing.HPCCDFUFile dfufile, java.util.HashMap<java.lang.String, de.hpi.hpcc.parsing.HPCCColumnMetaData> availablecols) {
    java.util.Enumeration<?> fields = dfufile.getAllFields();
    while (fields.hasMoreElements()) {
        de.hpi.hpcc.parsing.HPCCColumnMetaData col = ((de.hpi.hpcc.parsing.HPCCColumnMetaData) (fields.nextElement()));
        availablecols.put((((col.getTableName().toLowerCase()) + ".") + (col.getColumnName().toLowerCase())), col);
    } 
}