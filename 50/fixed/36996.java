public boolean handleResponse(org.apache.synapse.MessageContext messageContext) {
    return mediate(messageContext, org.wso2.carbon.apimgt.gateway.handlers.ext.APIManagerExtensionHandler.DIRECTION_OUT);
}