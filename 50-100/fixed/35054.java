@java.lang.Override
public void close() {
    try {
        importContracts();
        publishServices();
        registerApplications();
        for (io.apiman.manager.api.gateway.IGatewayLink gwLink : gatewayLinkCache.values()) {
            try {
                gwLink.close();
            } catch (java.lang.Exception e) {
            }
        }
        storage.commitTx();
        logger.info("-----------------------------------");
        logger.info(Messages.i18n.format("StorageImportDispatcher.ImportingImportComplete"));
        logger.info("-----------------------------------");
    } catch (io.apiman.manager.api.core.exceptions.StorageException e) {
        error(e);
    }
}