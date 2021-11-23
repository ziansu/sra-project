private void run() throws java.lang.Exception {
    boolean enabled = conf.getBoolean(SmartConfKeys.DFS_SSM_ENABLED_KEY, SmartConfKeys.DFS_SSM_ENABLED_DEFAULT);
    if (enabled) {
        startEngines();
        serviceState = org.smartdata.common.SmartServiceState.ACTIVE;
    }else {
        serviceState = org.smartdata.common.SmartServiceState.DISABLED;
    }
    rpcServer.start();
    httpServer.start();
    org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConf = org.apache.zeppelin.conf.ZeppelinConfiguration.create();
    org.apache.zeppelin.server.ZeppelinServer.startZeppelinServer(zeppelinConf);
}