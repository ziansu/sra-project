private void runAs(io.subutai.hub.share.dto.environment.EnvironmentPeerDto peerDto) {
    if (canIgnoreState(peerDto)) {
        log.info("Ignoring state: {}", peerDto.getState());
        return ;
    }
    try {
        java.lang.Object result = doHandle(peerDto);
        post(peerDto, result);
    } catch (java.lang.Exception e) {
        log.error("Failed to process environment state: ", e);
        handleError(peerDto, e);
    }
}