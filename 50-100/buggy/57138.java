private org.wso2.carbon.identity.application.authentication.framework.inbound.HttpIdentityRequestFactory getIdentityRequestFactory(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    java.util.List<org.wso2.carbon.identity.application.authentication.framework.inbound.HttpIdentityRequestFactory> factories = org.wso2.carbon.identity.application.authentication.framework.internal.FrameworkServiceDataHolder.getInstance().getHttpIdentityRequestFactories();
    java.util.Collections.sort(factories, new org.wso2.carbon.identity.core.handler.HandlerComparator());
    for (org.wso2.carbon.identity.application.authentication.framework.inbound.HttpIdentityRequestFactory requestBuilder : factories) {
        if (requestBuilder.canHandle(request, response)) {
            return requestBuilder;
        }
    }
    throw org.wso2.carbon.identity.application.authentication.framework.inbound.FrameworkRuntimeException.error("No HttpIdentityRequestFactory found to create the request");
}