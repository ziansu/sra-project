public void update(org.icgc.dcc.dev.server.portal.Portal portal) {
    @lombok.Cleanup
    lombok.val lock = locks.lockWriting(portal);
    lombok.val status = getStatus(portal.getId());
    if (status.isRunning()) {
        executor.stop(portal);
    }
    deployer.deploy(portal);
    repository.save(portal);
    executor.startAsync(portal);
    notifyChange(portal, PortalChangeType.UPDATED);
}