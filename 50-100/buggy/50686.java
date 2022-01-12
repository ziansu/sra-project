private boolean doBackup() {
    fr.xephi.authme.datasource.DataSourceType dataSourceType = settings.getProperty(DatabaseSettings.BACKEND);
    switch (dataSourceType) {
        case FILE :
            return performFileBackup("auths.db");
        case MYSQL :
            return performMySqlBackup();
        case MSSQL :
            fr.xephi.authme.ConsoleLogger.warning("You have to do an SQL Server backup manually!");
        case SQLITE :
            java.lang.String dbName = settings.getProperty(DatabaseSettings.MYSQL_DATABASE);
            return performFileBackup((dbName + ".db"));
        default :
            fr.xephi.authme.ConsoleLogger.warning((("Unknown data source type '" + dataSourceType) + "' for backup"));
    }
    return false;
}