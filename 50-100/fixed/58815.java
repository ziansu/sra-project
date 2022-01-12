private void setSiteError(java.lang.String siteId, com.emc.storageos.svcs.errorhandling.resources.InternalServerErrorException exception) {
    if ((siteId == null) || (siteId.isEmpty()))
        return ;
    
    com.emc.storageos.coordinator.client.model.Site site = drUtil.getSiteFromLocalVdc(siteId);
    site.setState(SiteState.STANDBY_ERROR);
    coordinator.persistServiceConfiguration(site.toConfiguration());
    com.emc.storageos.coordinator.client.model.SiteError error = new com.emc.storageos.coordinator.client.model.SiteError(exception);
    coordinator.setTargetInfo(site.getUuid(), error);
}