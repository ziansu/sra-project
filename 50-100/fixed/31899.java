private void accept(com.sun.enterprise.deployment.util.MessageDestinationReferenceDescriptor resRef, com.sun.enterprise.deployment.util.JndiNameEnvironment env) {
    if (resRef.isLinkedToMessageDestination()) {
        validateJNDIRefs(resRef.getMessageDestination().getJndiName(), env);
    }else {
        validateJNDIRefs(resRef.getJndiName(), env);
    }
}