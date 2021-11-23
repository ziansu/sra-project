private void markMigrationFail(java.lang.String currentSchemaVersion, java.lang.Exception e) {
    schemaUtil.setMigrationStatus(MigrationStatus.FAILED);
    java.lang.String errMsg = java.lang.String.format("The DB migration fails from %s to %s due to some unexpected error.", currentSchemaVersion, targetVersion);
    if ((failedCallbackName) != null) {
        errMsg += ("(The failed DB migration callback is " + (failedCallbackName)) + ").";
    }
    errMsg += " Please contract the EMC support team.";
    alertLog.error(errMsg);
    if (e != null) {
        com.emc.storageos.db.server.impl.MigrationHandlerImpl.log.error(e.getMessage(), e);
    }
}