@org.glowroot.markers.OnlyUsedByTests
public void close() throws java.lang.Exception {
    scheduledExecutor.shutdownNow();
    uiModule.close();
    collectorModule.close();
    transactionModule.close();
    storageModule.close();
    if (org.glowroot.GlowrootModule.shouldOverrideLogging()) {
        ((ch.qos.logback.classic.LoggerContext) (org.slf4j.LoggerFactory.getILoggerFactory())).reset();
    }
    dataDirFileLock.release();
    dataDirLockFile.close();
}