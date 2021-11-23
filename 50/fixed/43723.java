private static void loadDatabase(java.lang.String filename) throws java.lang.Exception {
    org.dspace.core.ConfigurationManager.loadConfig("target/testResources/config/dspace.cfg");
    org.dspace.storage.rdbms.DatabaseManager.loadSql(new java.io.FileReader(new java.io.File(filename).getCanonicalPath()));
}