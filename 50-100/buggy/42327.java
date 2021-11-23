public java.lang.String map(java.lang.String subject, java.lang.String providerId) {
    gov.ca.cwds.service.scripts.IdentityMappingScript mappingScript = loadMappingScriptForServiceProvider(providerId);
    if (mappingScript != null) {
        gov.ca.cwds.rest.api.domain.auth.UserAuthorization authorization = userAuthorizationService.find(subject);
        try {
            return mappingScript.map(authorization);
        } catch (javax.script.ScriptException e) {
            throw new java.lang.RuntimeException(("Identity Mapping failed for service provider: " + providerId), e);
        }
    }
    return subject;
}