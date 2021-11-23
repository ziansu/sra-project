private void setDefaultTableConnection() {
    java.lang.String[] tables = getTables();
    if ((tables.length) > 0)
        setTableConnection(dbConn.connect(tables[0]));
    else
        setTableConnection(null);
    
}