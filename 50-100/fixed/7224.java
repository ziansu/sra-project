@org.glowroot.markers.OnlyUsedByTests
public void close() throws java.lang.Exception {
    uiModule.close();
    collectorModule.close();
    transactionModule.close();
    storageModule.close();
    scheduledExecutor.shutdownNow();
    if (org.glowroot.GlowrootModule.shouldOverrideLogging()) {
        ((ch.qos.logback.classic.LoggerContext) (org.slf4j.LoggerFactory.getILoggerFactory())).reset();
    }
    dataDirFileLock.release();
    dataDirLockFile.close();
}