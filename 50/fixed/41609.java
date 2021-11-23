private java.lang.String getVulnerabililtyBomComponentUrl(final com.blackducksoftware.integration.hub.model.view.ProjectVersionView projectVersionItem) throws com.blackducksoftware.integration.exception.EncryptionException, com.blackducksoftware.integration.hub.exception.HubIntegrationException, java.lang.IllegalArgumentException {
    final com.blackducksoftware.integration.hub.api.item.MetaService metaService = hubServicesFactory.createMetaService();
    return metaService.getFirstLink(projectVersionItem, MetaService.VULNERABLE_COMPONENTS_LINK);
}