public void activate(java.lang.String nsr_id) throws org.openbaton.exceptions.NotFoundException, org.openbaton.exceptions.VimException {
    log.debug(("Activating Elasticity for NSR with id: " + nsr_id));
    if (autoScalingProperties.getPool().isActivate()) {
        log.debug("Activating pool mechanism");
        poolManagement.activate(nsr_id);
    }else {
        log.debug("pool mechanism is disabled");
    }
    detectionManagment.start(nsr_id);
    log.info(("Activated Elasticity for NSR with id: " + nsr_id));
}