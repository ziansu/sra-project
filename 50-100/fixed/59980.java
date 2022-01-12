public org.jboss.portletbridge.bridge.scope.BridgeRequestScope removeRequestScope(org.jboss.portletbridge.bridge.context.BridgeContext ctx, java.lang.String portletName, java.lang.String sessionId, java.lang.String viewId, java.lang.String portletMode) {
    java.lang.String idPrefix = org.jboss.portletbridge.bridge.scope.BridgeRequestScopeUtil.generateBridgeRequestScopeIdPrefix(portletName, sessionId, viewId, portletMode);
    java.lang.String scopeKey = this.scopeIdMap.get(idPrefix);
    org.jboss.portletbridge.bridge.scope.BridgeRequestScope scope = null;
    if (null != scopeKey) {
        scope = removeRequestScopeById(ctx, scopeKey);
        this.scopeIdMap.remove(idPrefix);
    }
    return scope;
}