@org.junit.Before
public void setup() {
    provider = new org.duracloud.audit.provider.AuditStorageProvider(targetProvider, account, storeId, storeType, userUtil, taskQueue);
    provider.setLoggers(readLogger, writeLogger);
}