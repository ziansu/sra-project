@java.lang.Override
public void databaseMigration() throws java.sql.SQLException {
    final java.lang.String productHome = org.wso2.carbon.utils.CarbonUtils.getCarbonHome();
    java.lang.String scriptPath = ((((productHome + (java.io.File.separator)) + "migration-scripts") + (java.io.File.separator)) + "18-19-migration") + (java.io.File.separator);
    updateAPIManagerDatabase(scriptPath);
    java.lang.String constraintsScriptPath = ((((productHome + (java.io.File.separator)) + "migration-scripts") + (java.io.File.separator)) + "18-19-migration") + (java.io.File.separator);
}