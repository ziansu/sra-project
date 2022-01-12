public void validateRole(com.vmware.identity.rest.core.server.authorization.Role requiredRole) throws com.vmware.identity.rest.core.server.authorization.exception.InsufficientRoleException {
    if ((token.getRole()) != null) {
        checkRoleField(requiredRole);
    }else {
        checkGroupsField(requiredRole);
    }
}