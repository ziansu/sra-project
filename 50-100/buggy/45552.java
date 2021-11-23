protected void handleException(java.lang.String msg, org.apache.synapse.MessageContext msgContext) {
    log.error(msg);
    if ((msgContext.getServiceLog()) != null) {
        msgContext.getServiceLog().error(msg);
    }
    if (shouldTrace(msgContext.getTracingState())) {
        org.apache.synapse.mediators.AbstractMediator.trace.error(msg);
    }
    throw new org.apache.synapse.SynapseException(msg);
}