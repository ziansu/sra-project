@org.springframework.scheduling.annotation.Async
public void activate(java.lang.String nsr_id, java.lang.String vnfr_id) throws org.openbaton.exceptions.NotFoundException, org.openbaton.exceptions.VimException {
    log.debug(("Activating Elasticity for NSR with id: " + nsr_id));
    detectionManagment.start(nsr_id, vnfr_id);
    if (autoScalingProperties.getPool().isActivate()) {
        log.debug("Activating pool mechanism");
        poolManagement.activate(nsr_id, vnfr_id);
    }else {
        log.debug("pool mechanism is disabled");
    }
    log.info(("Activated Elasticity for NSR with id: " + nsr_id));
}