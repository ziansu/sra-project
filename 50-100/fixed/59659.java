@java.lang.Deprecated
protected void auditWarn(java.lang.String msg, org.apache.synapse.MessageContext msgContext) {
    log.warn(msg);
    if ((msgContext.getServiceLog()) != null) {
        msgContext.getServiceLog().warn(msg);
    }
    if (shouldTrace(msgContext)) {
        org.apache.synapse.mediators.AbstractMediator.trace.warn(msg);
    }
}