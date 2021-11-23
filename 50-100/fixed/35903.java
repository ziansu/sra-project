public boolean isAuthorized(java.lang.String userId, java.util.List<java.lang.String> groupIds, java.util.List<org.camunda.bpm.engine.impl.db.PermissionCheck> permissionChecks) {
    java.util.List<java.lang.String> filteredGroupIds = filterAuthenticatedGroupIds(groupIds);
    boolean isRevokeAuthorizationChecksEnabled = existsRevokeAuthorizations(userId, groupIds);
    org.camunda.bpm.engine.impl.db.AuthorizationCheck authCheck = new org.camunda.bpm.engine.impl.db.AuthorizationCheck(userId, filteredGroupIds, permissionChecks, isRevokeAuthorizationChecksEnabled);
    return getDbEntityManager().selectBoolean("isUserAuthorizedForResource", authCheck);
}