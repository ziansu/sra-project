static org.smartdata.server.SmartServer processWith(org.smartdata.server.SmartServer.StartupOption startOption, org.smartdata.conf.SmartConf conf) throws java.lang.Exception {
    if (startOption == (org.smartdata.server.SmartServer.StartupOption.FORMAT)) {
        org.smartdata.server.SmartServer.LOG.info("Formatting DataBase ...");
        org.smartdata.metastore.utils.MetaStoreUtils.formatDatabase(conf);
        org.smartdata.server.SmartServer.LOG.info("Formatting DataBase finished successfully!");
    }
    org.smartdata.server.SmartServer ssm = new org.smartdata.server.SmartServer(conf);
    try {
        ssm.initWith(startOption);
        ssm.run();
        return ssm;
    } catch (java.lang.Exception e) {
        ssm.shutdown();
        throw e;
    }
}