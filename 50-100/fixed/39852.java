protected void deassociateHandlerFromProvider(org.semanticweb.ore.networking.ServerExecutionManager.ExecutionTaskHandlerItem handlerItem) {
    org.semanticweb.ore.networking.ServerExecutionManager.ExecutionTaskProviderItem providerItem = handlerItem.getAssociatedExecutionProvider();
    if (providerItem != null) {
        deassociateHandlerFromProvider(handlerItem, providerItem);
        providerItem.getProvider().postExecutionTaskHandlerRemovement(handlerItem.getExecutionHandler());
        org.semanticweb.ore.networking.ServerExecutionManager.mLogger.info("Deassociate execution handler '{}' from competition '{}'.", handlerItem, providerItem);
    }
}