public void createRegistryDatabase() throws java.lang.Exception {
    java.lang.String databaseType = org.wso2.carbon.utils.dbcreator.DatabaseCreator.getDatabaseType(this.dataSource.getConnection());
    java.lang.String scripPath = getDbScriptLocation(databaseType);
    java.io.File scripFile = new java.io.File(scripPath);
    if (scripFile.exists()) {
        super.createRegistryDatabase();
    }
}