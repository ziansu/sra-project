public static boolean isWhiteListedScope(java.lang.String scope) {
    java.util.List<java.lang.String> scopeSkipList = org.wso2.carbon.device.mgt.oauth.extensions.internal.OAuthExtensionsDataHolder.getInstance().getWhitelistedScopes();
    for (java.lang.String scopeTobeSkipped : scopeSkipList) {
        if (scope.matches(scopeTobeSkipped)) {
            return true;
        }
    }
    return false;
}