private void populateContextFromAuthId(java.lang.String authId) {
    try {
        java.lang.String sessionId = authIdHelper.reconstructAuthId(authId).getClaimsSet().getClaim(org.forgerock.openam.core.rest.authn.SESSION_ID, java.lang.String.class);
        if (org.apache.commons.lang.StringUtils.isEmpty(sessionId)) {
            return ;
        }
        java.lang.String contextId = getContextIdFromSessionId(sessionId);
        if (org.apache.commons.lang.StringUtils.isNotEmpty(contextId)) {
            org.forgerock.openam.audit.context.AuditRequestContext.putProperty(org.forgerock.openam.core.rest.authn.CONTEXT_ID, contextId);
        }
    } catch (org.forgerock.openam.core.rest.authn.exceptions.RestAuthException e) {
        org.forgerock.openam.core.rest.authn.AuthenticationAccessAuditFilter.debug.warning("No session ID found when trying to audit an authentication request.");
    }
}