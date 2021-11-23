protected void handleException(java.lang.String msg, java.lang.Exception e, org.apache.synapse.MessageContext msgContext) {
    log.error(msg, e);
    if ((msgContext.getServiceLog()) != null) {
        msgContext.getServiceLog().error(msg, e);
    }
    if (shouldTrace(msgContext)) {
        org.apache.synapse.mediators.AbstractMediator.trace.error(msg, e);
    }
    throw new org.apache.synapse.SynapseException(msg, e);
}