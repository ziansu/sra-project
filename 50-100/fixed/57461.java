public static void main(java.lang.String[] args) throws java.lang.Exception {
    args = co.codewizards.cloudstore.core.util.MainArgsUtil.extractAndApplySystemPropertiesReturnOthers(args);
    co.codewizards.cloudstore.server.CloudStoreServer.initLogging();
    try {
        co.codewizards.cloudstore.server.CloudStoreServer.createCloudStoreServer(args).run();
    } catch (final java.lang.Throwable x) {
        co.codewizards.cloudstore.server.CloudStoreServer.logger.error(x.toString(), x);
        java.lang.System.exit(999);
    }
}