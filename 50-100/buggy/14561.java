private void populateScopeConfigs(java.util.List<com.wso2telco.core.config.model.ScopeDetailsConfig.Scope> scopeConfigs) {
    if (!(com.wso2telco.claims.RemoteClaimsRetriever.scopeConfigsMap.isEmpty())) {
        for (com.wso2telco.core.config.model.ScopeDetailsConfig.Scope scope : scopeConfigs) {
            com.wso2telco.claims.RemoteClaimsRetriever.scopeConfigsMap.put(scope.getName(), scope);
        }
    }else {
        if (com.wso2telco.claims.RemoteClaimsRetriever.log.isDebugEnabled()) {
            com.wso2telco.claims.RemoteClaimsRetriever.log.debug("Could not load user-info claims.");
        }
    }
}