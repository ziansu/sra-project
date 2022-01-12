private org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityProcessor getIdentityProcessor(org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityRequest identityRequest) {
    java.util.List<org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityProcessor> processors = org.wso2.carbon.identity.application.authentication.framework.internal.FrameworkServiceDataHolder.getInstance().getIdentityProcessors();
    java.util.Collections.sort(processors, new org.wso2.carbon.identity.core.handler.HandlerComparator());
    for (org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityProcessor requestProcessor : processors) {
        if (requestProcessor.canHandle(identityRequest)) {
            return requestProcessor;
        }
    }
    return null;
}