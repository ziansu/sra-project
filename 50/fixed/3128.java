protected void checkForDatabase() {
    if ((currentDatabase) == null)
        throw new com.orientechnologies.common.exception.OException("Database not selected. Use 'connect <database-name>' to connect to a database.");
    
    if (currentDatabase.isClosed())
        throw new com.orientechnologies.orient.core.exception.ODatabaseException((("Database '" + (currentDatabaseName)) + "' is closed"));
    
}