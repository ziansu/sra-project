public static boolean isGranted(java.util.List<org.sigmah.server.domain.profile.OrgUnitProfile> userUnits, org.sigmah.server.domain.OrgUnit targetOrgUnit, org.sigmah.shared.dto.referential.GlobalPermissionEnum permission) {
    for (org.sigmah.server.domain.profile.OrgUnitProfile userUnit : userUnits) {
        if (!(org.sigmah.shared.util.OrgUnitUtils.areOrgUnitsEqualOrParent(userUnit.getOrgUnit(), targetOrgUnit.getId()))) {
            continue;
        }
        if (org.sigmah.server.handler.util.Handlers.isGranted(userUnit, permission)) {
            return true;
        }
    }
    return false;
}