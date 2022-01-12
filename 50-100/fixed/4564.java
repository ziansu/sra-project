@java.lang.Override
public void databaseMigration() throws java.sql.SQLException, org.wso2.carbon.apimgt.migration.APIMigrationException {
    java.lang.String amScriptPath = (((((org.wso2.carbon.utils.CarbonUtils.getCarbonHome()) + (java.io.File.separator)) + "migration-scripts") + (java.io.File.separator)) + "19-110-migration") + (java.io.File.separator);
    updateAPIManangerDatabase(amScriptPath);
    if (org.wso2.carbon.apimgt.migration.util.StatDBUtil.isTokenEncryptionEnabled()) {
        decryptEncryptedConsumerKeys();
    }
}