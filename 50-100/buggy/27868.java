public org.apache.stratos.messaging.domain.domain.mapping.DomainMapping[] getDomainMappings(java.lang.String applicationId, int tenantId) throws org.apache.stratos.manager.exception.DomainMappingException {
    try {
        org.apache.stratos.messaging.domain.application.signup.ApplicationSignUp applicationSignUp = applicationSignUpHandler.getApplicationSignUp(applicationId, tenantId);
        return applicationSignUp.getDomainMappings();
    } catch (java.lang.Exception e) {
        java.lang.String message = java.lang.String.format("Could not get domain mappings: [application-id] %s [tenant-id] %d", applicationId, tenantId);
        org.apache.stratos.manager.components.DomainMappingHandler.log.error(message, e);
        throw new org.apache.stratos.manager.exception.DomainMappingException(message, e);
    }
}