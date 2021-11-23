private void populateContextFromTokenId(java.lang.String tokenId) {
    try {
        com.iplanet.sso.SSOToken token = com.iplanet.sso.SSOTokenManager.getInstance().createSSOToken(tokenId);
        org.forgerock.openam.audit.context.AuditRequestContext.putProperty(org.forgerock.openam.core.rest.authn.USER_ID, org.forgerock.openam.audit.AMAuditEventBuilderUtils.getUserId(token));
        org.forgerock.openam.audit.context.AuditRequestContext.putProperty(org.forgerock.openam.core.rest.authn.CONTEXT_ID, org.forgerock.openam.audit.AMAuditEventBuilderUtils.getContextIdFromSSOToken(token));
    } catch (com.iplanet.sso.SSOException e) {
        org.forgerock.openam.core.rest.authn.AuthenticationAccessAuditFilter.debug.warning("No SSO Token found when trying to audit an authentication request.");
    }
}