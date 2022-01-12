private void evaluateUserContextRole(java.lang.Object internalSelection) {
    userContextRole = org.bbaw.bts.core.commons.BTSCoreConstants.USER_ROLE_GUESTS;
    if (((authenticatedUser) == null) || ((mainProject) == null)) {
    }else {
        org.bbaw.bts.btsmodel.BTSProjectDBCollection projectCollection = findProjectCollection(dbCollectionContext);
        userContextRole = evaluationService.highestRoleOfAuthenticatedUserInDBCollection(projectCollection);
    }
    workbenchContext.modify(BTSCoreConstants.CORE_EXPRESSION_USER_CONTEXT_ROLE, userContextRole);
}