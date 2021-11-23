private boolean forward(org.motechproject.commcare.config.Config config, java.lang.String type, java.lang.String url) {
    org.motechproject.commcare.domain.CommcareDataForwardingEndpoint newForwardingEndpoint = new org.motechproject.commcare.domain.CommcareDataForwardingEndpoint(config.getAccountConfig().getDomain(), type, url, null);
    return forwardingEndpointService.createNewDataForwardingRule(newForwardingEndpoint, config);
}