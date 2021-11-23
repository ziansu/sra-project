protected java.lang.String getContextIdForAccessAttempt(org.restlet.Request request) {
    return org.forgerock.openam.audit.context.AuditRequestContext.getProperty(org.forgerock.openam.rest.audit.CONTEXT_ID);
}