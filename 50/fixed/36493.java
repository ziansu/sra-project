@service.Deactivate
protected void deactivate() {
    agentFlowService.removeFlowsByAppId();
    rmqService.removeListener(rmqMsgListener);
    log.info("Stopped");
}