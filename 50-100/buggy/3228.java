private void runAs(io.subutai.hub.share.dto.environment.EnvironmentPeerDto peerDto) {
    if (canIgnoreState(peerDto)) {
        log.info("Ignoring state: {}", peerDto.getState());
        return ;
    }
    try {
        java.lang.Object result = doHandle(peerDto);
        io.subutai.core.hubmanager.impl.http.RestResult<java.lang.Object> restResult = post(peerDto, result);
        if (restResult.isSuccess()) {
            onSuccess(peerDto);
        }
    } catch (java.lang.Exception e) {
        log.error("Failed to process environment state: ", e);
        handleError(peerDto, e);
    }
}