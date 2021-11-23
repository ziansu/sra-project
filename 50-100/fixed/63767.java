public static void init() {
    if ((fulltextsearch.appdaemon.AppConfig.ftpPrivateKey) == null) {
        fulltextsearch.dao.DBHelperKeyTable dbHelperKeytable = new fulltextsearch.dao.DBHelperKeyTable();
        fulltextsearch.appdaemon.AppConfig.ftpPrivateKey = dbHelperKeytable.getAESPrivateKey();
    }
    fulltextsearch.dao.DBHelperConfigTable config = new fulltextsearch.dao.DBHelperConfigTable();
    fulltextsearch.pojos.ConfigCollection configCollection = config.getFromConfigTable();
    if (configCollection != null) {
        fulltextsearch.appdaemon.AppConfig.startFullText = configCollection.isStartFulltext();
        fulltextsearch.appdaemon.AppConfig.startDocAttachProcess = configCollection.isStartDocProcess();
    }
    fulltextsearch.appdaemon.AppConfig.loadConfiguration();
    config.getFtpConfiguration();
}