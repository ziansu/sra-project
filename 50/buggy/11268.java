public java.lang.String databaseDir() {
    if (prop.isEmpty())
        return org.ethereum.config.SystemProperties.DEFAULT_DATABASE_DIR;
    
    return prop.getProperty("database.dir");
}