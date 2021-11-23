protected java.lang.String getUserIdForAccessOutcome(org.restlet.Response response) {
    java.lang.String userId = org.forgerock.openam.audit.context.AuditRequestContext.getProperty(org.forgerock.openam.rest.audit.USER_ID);
    return userId == null ? "" : userId;
}