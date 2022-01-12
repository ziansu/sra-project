@java.lang.Deprecated
protected void auditLog(java.lang.String msg, org.apache.synapse.MessageContext msgContext) {
    log.info(msg);
    if ((msgContext.getServiceLog()) != null) {
        msgContext.getServiceLog().info(msg);
    }
    if (shouldTrace(msgContext.getTracingState())) {
        org.apache.synapse.mediators.AbstractMediator.trace.info(msg);
    }
}