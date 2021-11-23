private org.wso2.carbon.identity.application.authentication.framework.inbound.HttpIdentityResponseFactory getHttpIdentityResponseFactory(org.wso2.carbon.identity.application.authentication.framework.inbound.IdentityResponse identityResponse) {
    java.util.List<org.wso2.carbon.identity.application.authentication.framework.inbound.HttpIdentityResponseFactory> factories = org.wso2.carbon.identity.application.authentication.framework.internal.FrameworkServiceDataHolder.getInstance().getHttpIdentityResponseFactories();
    java.util.Collections.sort(factories, new org.wso2.carbon.identity.core.handler.HandlerComparator());
    for (org.wso2.carbon.identity.application.authentication.framework.inbound.HttpIdentityResponseFactory responseFactory : factories) {
        if (responseFactory.canHandle(identityResponse)) {
            return responseFactory;
        }
    }
    throw org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkRuntimeException.error("No HttpIdentityResponseFactory found to create the request");
}