protected java.lang.String getUserIdForAccessAttempt(org.restlet.Request request) {
    java.lang.String userId = org.forgerock.openam.audit.context.AuditRequestContext.getProperty(org.forgerock.openam.rest.audit.USER_ID);
    return userId == null ? "" : userId;
}