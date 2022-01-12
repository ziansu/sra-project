private void checkForVdcRolesUsingDomains(com.emc.storageos.api.service.impl.resource.StringSet domains) {
    com.emc.storageos.api.service.impl.resource.VirtualDataCenter localVdc = com.emc.storageos.db.common.VdcUtil.getLocalVdc();
    java.util.List<com.emc.storageos.api.service.impl.resource.RoleAssignmentEntry> vdcRoles = _permissionsHelper.convertToRoleAssignments(localVdc.getRoleAssignments(), true);
    java.util.List<java.lang.String> matchingUsers = checkRolesUsingDomains(vdcRoles, domains);
    if (!(matchingUsers.isEmpty())) {
        throw APIException.badRequests.cannotDeleteAuthProviderWithVdcRoles(matchingUsers.size(), matchingUsers);
    }
}