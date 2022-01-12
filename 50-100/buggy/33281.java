@java.lang.Override
public synchronized void close() {
    try {
        if ((boneCP) != null)
            boneCP.close();
        
        boneCPConfig = null;
        logger.log(java.util.logging.Level.INFO, "DBService stopped! (Service Name: {0})", serviceName);
    } catch (java.lang.Exception ex) {
        logger.log(java.util.logging.Level.SEVERE, "Shutdown boneCP failed!", ex);
    }
}