@java.lang.Override
protected void clearSavedData() throws com.zimbra.common.service.ServiceException {
    config.unsetAttributeMigrationInfo();
    com.zimbra.cs.ephemeral.migrate.AttributeMigration.clearConfigCacheOnAllServers(true, false);
}