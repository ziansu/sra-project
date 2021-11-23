public org.wso2.carbon.identity.gateway.api.IdentityResponse process(org.wso2.carbon.identity.gateway.api.IdentityRequest identityRequest) throws org.wso2.carbon.identity.gateway.api.FrameworkException {
    org.wso2.carbon.identity.gateway.api.IdentityProcessor processor = getIdentityProcessor(identityRequest);
    if (processor != null) {
        return processor.process(identityRequest).build();
    }else {
        throw org.wso2.carbon.identity.gateway.api.FrameworkRuntimeException.error("No IdentityProcessor found to process the request");
    }
}