@java.lang.Override
public void startingShutdown() {
    org.apache.ode.bpel.iapi.Scheduler scheduler = ((org.wso2.carbon.bpel.core.ode.integration.BPELServerImpl) (org.wso2.carbon.bpel.core.internal.BPELServiceComponent.getBPELServer())).getScheduler();
    if (scheduler != null) {
        if (org.wso2.carbon.bpel.core.ode.integration.BPELSchedulerShutdown.log.isDebugEnabled()) {
            org.wso2.carbon.bpel.core.ode.integration.BPELSchedulerShutdown.log.debug("Shutting down quartz scheduler.");
        }
        scheduler.shutdown();
    }
    status = true;
}