@service.Deactivate
protected void deactivate() {
    agentFlowService.removeFlowsByAppId();
    rmqService.removeListener(rmqMsgListener);
    configService.removeListener(configListener);
    eventExecutor.shutdownNow();
    eventExecutor = null;
    log.info("Stopped");
}