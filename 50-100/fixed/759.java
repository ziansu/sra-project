@java.lang.Override
public void addExistingDatabaseTable(final java.lang.String symbolicName, final java.lang.String dbTableName) throws eu.unifiedviews.dataunit.DataUnitException {
    checkForMultithreadAccess();
    if (!(checkTableExists(dbTableName))) {
        throw new eu.unifiedviews.dataunit.DataUnitException((("Database table " + dbTableName) + " does not exist!"));
    }
    saveTableInRepository(symbolicName, dbTableName);
    this.databaseTables.add(dbTableName);
}