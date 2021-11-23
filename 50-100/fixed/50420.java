private void processResult(java.lang.String endpointId, org.eclipse.che.api.core.jsonrpc.commons.JsonRpcResponse response, java.lang.String key, java.lang.Class<?> rClass) {
    org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.LOGGER.debug("Response has result. Proceeding...");
    org.eclipse.che.api.core.jsonrpc.commons.JsonRpcResult result = response.getResult();
    if (result.isSingle()) {
        processOne(endpointId, result, rClass, org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.cast(promises.remove(key).getSuccessConsumer()));
    }else {
        processMany(endpointId, result, rClass, org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.cast(promises.remove(key).getSuccessConsumer()));
    }
}