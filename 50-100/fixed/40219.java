protected void populateStandbySiteErrorIfNecessary(com.emc.storageos.coordinator.client.model.Site site, com.emc.storageos.svcs.errorhandling.resources.InternalServerErrorException e) {
    com.emc.storageos.coordinator.client.model.SiteError error = new com.emc.storageos.coordinator.client.model.SiteError(e);
    com.emc.storageos.systemservices.impl.vdc.VdcOpHandler.log.info("Set error state for site: {}", site.getUuid());
    coordinator.getCoordinatorClient().setTargetInfo(site.getUuid(), error);
    site.setState(SiteState.STANDBY_ERROR);
    coordinator.getCoordinatorClient().persistServiceConfiguration(site.toConfiguration());
}