public void update(org.icgc.dcc.dev.server.portal.Portal portal) {
    @lombok.Cleanup
    lombok.val lock = locks.lockWriting(portal);
    portal = repository.save(portal);
    lombok.val status = getStatus(portal.getId());
    if (status.isRunning()) {
        executor.stop(portal);
    }
    deployer.deploy(portal);
    executor.startAsync(portal);
    notifyChange(portal, PortalChangeType.UPDATED);
}