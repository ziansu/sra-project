public void init(org.shaolin.bmdp.workflow.internal.cache.FlowObject flowInfo) throws org.shaolin.bmdp.workflow.exception.ConfigException {
    this.flowInfo = flowInfo;
    this.flowInfo.parse();
    this.sessionService = ((org.shaolin.bmdp.workflow.spi.SessionService) (org.shaolin.bmdp.runtime.AppContext.get().getService(this.flowInfo.getSessionService())));
    if ((this.sessionService) == null) {
        this.sessionService = new org.shaolin.bmdp.workflow.internal.DefaultFlowSessionService();
    }
}