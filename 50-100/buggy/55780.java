private boolean doThrottle(org.apache.synapse.MessageContext messageContext) {
    boolean isThrottled = true;
    if (!(messageContext.isResponse())) {
        org.apache.synapse.MessageContext axis2MC = ((org.apache.synapse.core.axis2.Axis2MessageContext) (messageContext)).getAxis2MessageContext();
        org.apache.axis2.context.ConfigurationContext cc = axis2MC.getConfigurationContext();
        isThrottled = doRoleBasedAccessThrottlingWithCEP(messageContext, cc);
    }
    if (isThrottled) {
        handleThrottleOut(messageContext);
        return false;
    }
    return true;
}