public void ignoreResources(org.rhq.core.domain.auth.Subject subject, int[] resourceIds) {
    if ((resourceIds == null) || ((resourceIds.length) == 0)) {
        return ;
    }
    checkStatus(subject, resourceIds, InventoryStatus.IGNORED, java.util.EnumSet.of(InventoryStatus.NEW, InventoryStatus.COMMITTED));
    try {
        this.availabilityManager.setResourceAvailabilities(resourceIds, AvailabilityType.UNKNOWN);
    } catch (java.lang.Exception e) {
        org.rhq.enterprise.server.discovery.DiscoveryBossBean.LOG.error(("Failed to reset availabilities for resources being ignored: " + (org.rhq.core.util.exception.ThrowableUtil.getAllMessages(e))));
    }
    return ;
}