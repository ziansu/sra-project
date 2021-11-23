@java.lang.Override
public synchronized void close() throws com.actemium.basicTvx_sdk.restclient.RestException {
    com.actemium.basicTvx_sdk.GlobalObjectManager.LOGGER.info("fermeture du GOM");
    com.actemium.basicTvx_sdk.GlobalObjectManager.isInit = false;
    if ((com.actemium.basicTvx_sdk.GlobalObjectManager.instance.persistanceManager) != null)
        com.actemium.basicTvx_sdk.GlobalObjectManager.instance.persistanceManager.closeHttpClient();
    
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.idHelper = null;
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.factory = null;
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.persistanceManager = null;
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.gestionCache = null;
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.isCachePurgeAutomatiquementSiException = false;
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.nonRecuperableViaWebService.clear();
    com.actemium.basicTvx_sdk.GlobalObjectManager.instance.lockFindOrCreate = null;
}