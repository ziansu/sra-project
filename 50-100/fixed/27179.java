private void processError(java.lang.String endpointId, org.eclipse.che.api.core.jsonrpc.commons.JsonRpcResponse response, java.lang.String key) {
    org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.LOGGER.debug("Response has error. Proceeding...");
    org.eclipse.che.api.core.jsonrpc.commons.JsonRpcError error = response.getError();
    org.eclipse.che.api.core.jsonrpc.commons.JsonRpcPromise<org.eclipse.che.api.core.jsonrpc.commons.JsonRpcError> jsonRpcPromise = org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.cast(promises.remove(key));
    java.util.function.BiConsumer<java.lang.String, org.eclipse.che.api.core.jsonrpc.commons.JsonRpcError> consumer = jsonRpcPromise.getFailureConsumer();
    if (consumer != null) {
        org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.LOGGER.debug("Failure consumer is found, accepting...");
        consumer.accept(endpointId, error);
    }else {
        org.eclipse.che.api.core.jsonrpc.commons.ResponseDispatcher.LOGGER.debug("Reject function is not found, skipping");
    }
}