private void setClaims(org.opensaml.saml2.metadata.SPSSODescriptor spssoDescriptor, org.wso2.carbon.identity.core.model.SAMLSSOServiceProviderDO samlssoServiceProviderDO) {
    java.util.List<org.opensaml.saml2.metadata.AttributeConsumingService> services;
    services = spssoDescriptor.getAttributeConsumingServices();
    if ((services != null) && ((services.size()) > 0)) {
        org.opensaml.saml2.metadata.AttributeConsumingService service = services.get(0);
        java.util.List<org.opensaml.saml2.metadata.RequestedAttribute> attributes = service.getRequestAttributes();
        for (org.opensaml.saml2.metadata.RequestedAttribute attribute : attributes) {
        }
    }else {
    }
}